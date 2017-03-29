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
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

@Invariant("getAssurance() == null ? true : getPermis().getPoints() > 0")
public class Assure {

	private Permis permis;
	private Assurance assurance = null;

	public Assure(Permis permis) {
		this.permis = permis;
	}

	@Requires("getAssurance() != null")
	@Ensures("result == getAssurance().getVehicule().getValeur()")
	public Integer valeurVehicule() {
		return assurance.getVehicule().getValeur();
	}

	public Permis getPermis() {
		return permis;
	}

	public Assurance getAssurance() {
		return assurance;
	}
}
