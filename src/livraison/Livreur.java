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

@Invariant("valeurAssurance() >= 100000")
public interface Livreur {

    /**
     * Livre un colis à destination et retourne le temps de livraison.
     *
     * @param colis colis à livrer
     * @param destination adresse de destination
     * @return temps de livraison
     */
    @Requires("colis.poids <= 5") // Le colis ne fait pas plus de 5kg.
    @Ensures("result <= 3") // Le colis est livré en 3h ou moins.
    public int livrer(Colis colis, String destination);

    /**
     * Retourne la valeur de l'assurance supportée par le livreur.
     */
    public int valeurAssurance();
}
