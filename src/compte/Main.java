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

public class Main {

    public static void main(String[] args) {
        // Contrat OK
        Compte c1 = new Compte();
        c1.crediter(10);
        c1.debiter(10);
        // Contrat FAIL
        Compte c2 = new Compte();
        c2.crediter(-10);
        // Contrat FAIL
        Compte c3 = new Compte();
        c3.crediter(10);
        c3.debiter(100);
    }

}
