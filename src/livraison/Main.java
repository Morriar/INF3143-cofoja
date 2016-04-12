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

public class Main {

    public static void main(String[] args) {
        Colis c1 = new Colis(1);
        Colis c5 = new Colis(5);
        Colis c10 = new Colis(10);

        //LivreurTest l0 = new LivreurTest();
        //l0.livrer(c1, "adresse");
        //l0.livrer(c5, "adresse");
        //l0.livrer(c10, "adresse");

        //LivreurVelo l1 = new LivreurVelo();
        //l1.livrer(new Colis(5), "adresse");
        //l1.livrer(c5, "adresse");
        //l1.livrer(c10, "adresse");

        //LivreurVoiture l2 = new LivreurVoiture();
        //l2.livrer(c1, "adresse");
        //l2.livrer(c5, "adresse");
        //l2.livrer(c10, "adresse");

        //LivreurCamion l3 = new LivreurCamion();
        //l3.livrer(c1, "adresse");
        //l3.livrer(c5, "adresse");
        //l3.livrer(c10, "adresse");

        System.out.println("fin");
    }

}
