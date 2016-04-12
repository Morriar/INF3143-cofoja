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

/**
 * Redéfinition de précondition et d'invariant invalide.
 */
public class LivreurVelo implements Livreur {

    @Override
    public int livrer(Colis colis, String destination) {
        // TODO retourner le temps de livraison
        return 1;
    }

    @Override
    public int valeurAssurance() {
        return 10000; // ne respecte pas l'invariant de Livreur
    }

}
