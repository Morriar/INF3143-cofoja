/*
 * Copyright 2016 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package compte;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

@Invariant("getSolde() >= 0")
public class Compte {

    private int solde;

    public Compte() {
        solde = 0;
    }

    @Requires("montant > 0")
    @Ensures("getSolde() == old(getSolde()) + montant")
    public void crediter(int montant) {
        solde += montant;
    }

    @Requires({
        "montant > 0",
        "getSolde() >= montant"
    })
    @Ensures("getSolde() == old(getSolde()) - montant")
    public void debiter(int montant) {
        solde -= montant;
    }

    public Integer getSolde() {
        return solde;
    }

}
