package apirest.productos.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode

public class LineasPedidoDto {

	// private Map<String, Integer> registro;
	
	private String nombreProd;
    private int cantidadVendida;
	
	// methods
	
	
	
	/*
	private int calcularCantidadTotal() {
		int cantTotal = 0;
		for (int i = 0; i < registro.size(); i++) {
			List< Map<String, Integer> > = new ArrayList<>(); 
		}
		return 0;
	}
	*/
}
