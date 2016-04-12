/*
 * Copyright 2015 Alexandre Terrasa <alexandre@moz-code.org>.
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
package livraison;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

/**
 * Redéfinition de postcondition invalide.
 */
@Invariant("valeurAssurance() >= 1000000")
public class LivreurCamion implements Livreur {

    @Override
    @Requires("colis.poids <= 50")
    @Ensures("result <= 24")
    public int livrer(Colis colis, String destination) {
        // TODO retourner le temps de livraison
        return 24;
    }

    @Override
    public int valeurAssurance() {
    	return 1000000;
    }
}
