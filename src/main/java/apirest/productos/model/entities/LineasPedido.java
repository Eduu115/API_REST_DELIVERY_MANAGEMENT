package apirest.productos.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString

@Entity
@Table(name="lineas_pedido")
public class LineasPedido {

	@Id
	@Column(name="numero_orden")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numeroOrden;
	
	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido;
	@ManyToOne
	@JoinColumn(name="id_producto")
	private Producto producto;
	
	private int cantidad;
	@Column(name="precio_unitario")
	private double precioUnitario;
	
}
