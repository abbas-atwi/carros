package com.example.carros.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Vai ler no banco de dados
@Service
public class CarroService {

    @Autowired(required=true)
    private CarroRepository rep;

    public Iterable<Carro> getCarros(){
        return rep.findAll();
    }

    public List<Carro> getCarrosFake(){
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro(1L, "Fusca"));
        carros.add(new Carro(2L, "Brasilia"));
        carros.add(new Carro(3L, "Chevete"));
        return carros;
    }
}
