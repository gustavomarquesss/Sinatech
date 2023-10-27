package com.br.checkpoint.classes;

public class Declaracao_imposto_renda_p_juridica {
	String regime_tributario;
	String receita_bruta;
	String impostos_pagos;
	String lucro_liquido;
	public String getRegime_tributario() {
		return regime_tributario;
	}
	public void setRegime_tributario(String regime_tributario) {
		this.regime_tributario = regime_tributario;
	}
	public String getReceita_bruta() {
		return receita_bruta;
	}
	public void setReceita_bruta(String receita_bruta) {
		this.receita_bruta = receita_bruta;
	}
	public String getImpostos_pagos() {
		return impostos_pagos;
	}
	public void setImpostos_pagos(String impostos_pagos) {
		this.impostos_pagos = impostos_pagos;
	}
	public String getLucro_liquido() {
		return lucro_liquido;
	}
	public void setLucro_liquido(String lucro_liquido) {
		this.lucro_liquido = lucro_liquido;
	}
}
