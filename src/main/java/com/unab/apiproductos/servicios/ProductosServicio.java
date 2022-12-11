package com.unab.apiproductos.servicios;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.apiproductos.modelos.ProductoDto;
import com.unab.apiproductos.modelos.ProductoEntidad;
import com.unab.apiproductos.repositorios.IProductoRepositorio;

@Service
public class ProductosServicio implements IProductoServicio{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IProductoRepositorio iProductoRepositorio;

    @Override
    public List<ProductoDto> obtenerProductos() {

        List<ProductoEntidad> productoEntidadsList= iProductoRepositorio.findAll();

        List<ProductoDto> productoDtosList= new ArrayList<>();

        for (ProductoEntidad productoEntidad : productoEntidadsList) {
            ProductoDto productoDto= modelMapper.map(productoEntidad, ProductoDto.class);
            productoDtosList.add(productoDto);
        }

        return productoDtosList;
    }

    @Override
    public ProductoDto creaProducto(ProductoDto productoDto) {
    
        ProductoEntidad productoEntidad= modelMapper.map(productoDto, ProductoEntidad.class);
        productoEntidad.setEstado(true);

        ProductoEntidad productoEntidadCreado= iProductoRepositorio.save(productoEntidad);

        ProductoDto productoDtoCreado= modelMapper.map(productoEntidadCreado, ProductoDto.class);

        return productoDtoCreado;

    }
    
}
