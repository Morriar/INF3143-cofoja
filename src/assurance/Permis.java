/*
 * Copyright 2016 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package assurance;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

public class Permis {

    public Integer points;

    @Ensures("points == 6")
    public Permis() {
        points = 6;
    }

    @Requires("points > 0")
    @Ensures("this.points == old(this.points) - points")
    public void retirerPoints(Integer points) {
        this.points -= points;
    }
}
