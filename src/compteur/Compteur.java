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
	"getValeurs() > 0",
	"getSomme() >= 0"
})
public class Compteur {

	private int valeurs;
	private int somme;

	public Compteur() {
		valeurs = 0;
		somme = 0;
	}

	@Requires("valeur >= 0")
	@Ensures({
		"getValeurs() == old(getValeurs()) + 1",
		"getSomme() == old(getSomme()) + valeur"
	})
	public void ajoute(int valeur) {
		valeurs += 1;
		somme += valeur;
	}

	@Requires("!isEmpty()")
	@Ensures("result == getSomme() / getValeurs()")
	public int moyenne() {
		return somme / valeurs;
	}

	// Retourne vrai si le compteur n'a aucune valeur.
	@Ensures("result == (getValeurs() == 0)")
	public boolean isEmpty() {
		return valeurs == 0;
	}

	public int getSomme() {
		return somme;
	}

	public void setSomme(int somme) {
		this.somme = somme;
	}

	public int getValeurs() {
		return valeurs;
	}

}
