package com.unab.apiproductos.servicios;

import java.util.List;

import com.unab.apiproductos.modelos.ProductoDto;

public interface IProductoServicio {
    
    List<ProductoDto> obtenerProductos();

    ProductoDto creaProducto(ProductoDto productoDto);
}
