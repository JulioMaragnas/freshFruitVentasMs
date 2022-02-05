package com.trabajodegrado.freshfruitventas.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.trabajodegrado.freshfruitventas.modelos.Ventas;


@Repository
public interface VentasRepositorio extends JpaRepository<Ventas, Integer>, PagingAndSortingRepository<Ventas, Integer>{
	public Page<Ventas> findByIdusuario(Integer idusuario, Pageable page);
	public Page<Ventas> findByIdestado(Integer idusuario, Pageable page);
	public Page<Ventas> findByIdusuariorepartidorAndIdestadoNot(Integer idusuariorepartidor, Integer idestado, Pageable page);
	public Page<Ventas> findByIdusuariorepartidorAndIdestado(Integer idusuariorepartidor, Integer idestado, Pageable page);
 }