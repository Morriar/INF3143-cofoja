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
package compteur;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

@Invariant({
    "valeurs >= 0",
    "somme >= 0"
})
public class Compteur {

    int valeurs;
    int somme;

    public Compteur() {
        valeurs = 0;
        somme = 0;
    }

    @Requires("valeur >= 0")
    @Ensures({
        "valeurs == old(valeurs) + 1",
        "somme == old(somme) + valeur",})
    public void ajoute(int valeur) {
        valeurs += 1;
        somme += valeur;
    }

    @Requires("!isEmpty()")
    public int moyenne() {
        return somme / valeurs;
    }

    // Retourne vrai si le compteur n'a aucune valeurs.
    public boolean isEmpty() {
        return valeurs == 0;
    }

}
