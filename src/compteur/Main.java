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

public class Main {

    public static void main(String[] args) {
        // Contrat OK
        Compteur c1 = new Compteur();
        c1.ajoute(1);
        c1.ajoute(2);
        c1.ajoute(3);
        System.out.println(c1.moyenne());
        // Contrat FAIL
        Compteur c2 = new Compteur();
        c2.moyenne();
        // Contrat FAIL
        Compteur c3 = new Compteur();
        c3.ajoute(-10);
        // Contrat FAIL
        Compteur c4 = new Compteur();
        c4.somme = -100;
        c4.ajoute(10);
    }

}
