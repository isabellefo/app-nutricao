package nutri;

public enum Grupo {

	G1 {
		public String toString() {
			return "Leite e derivados(com exceção da manteiga e da nata)";
		}
	},
	G2 {
		public String toString() {
			return "Carne, aves, peixes, embutidos, miúdos, ovos e leguminosas secas " ;
		}
	},
	G3 {
		public String toString() {
			return "Frutas e hortaliças";
		}
	},
	G4 {
		public String toString() {
			return "Grupo dos amidos";
		}
	},
	G5 {
		public String toString() {
			return "Gorduras animais e vegetais";
		}
	};

	public static Grupo[] getGrupo() {
		return new Grupo[] { 
				Grupo.G1, 
				Grupo.G2, 
				Grupo.G3, 
				Grupo.G4, 
				Grupo.G5,

		};
	}
}
