package br.eti.mertz.wkhtmltopdf.wrapper;

import lombok.Data;
import lombok.NonNull;

@Data
public class Param {

	@NonNull
	private String key;

	private String value;

	public Param(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public Param(String key) {
		this(key, null);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder().append(Symbol.separator)
				.append(Symbol.param).append(key);
		if (value != null)
			sb.append(Symbol.separator).append(value);
		return sb.toString();
	}

}
