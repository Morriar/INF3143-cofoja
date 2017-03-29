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

import com.google.java.contract.Invariant;

@Invariant({
	"getAssurance() == null ? true : (getCategorie().equals(getAssurance().getCategorie()))",
	"getAssurance() == null ? true : (getValeur() <= getAssurance().getValeur())"	
})
public class Vehicule {

	private String categorie;
	private Integer valeur;
	private Assurance assurance = null;

	public Vehicule(String categorie, Integer valeur) {
		this.categorie = categorie;
		this.valeur = valeur;
	}

	public Assurance getAssurance() {
		return assurance;
	}

	public void setAssurance(Assurance assurance) {
		this.assurance = assurance;
	}

	public String getCategorie() {
		return categorie;
	}

	public Integer getValeur() {
		return valeur;
	}
}
