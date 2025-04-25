package com.example.APIClassRoom.services;

import com.example.APIClassRoom.ayudas.MessagesAPI;
import com.example.APIClassRoom.modelos.Teacher;
import com.example.APIClassRoom.repositories.ITeacherRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired//Inyeccion de dependendicias que sirve para traer una clase s oatra y tulizarla en una secundaria
    ITeacherRepositorie repositorie;

    //En el servicio implementamos los metodos
    //Que necesitamos segun los servicios a ofrecer

    //Guardar
    public Teacher saveTeacher(Teacher dataTeacher) throws Exception {
        try {
            return this.repositorie.save(dataTeacher);
        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }

    //Actualizar
    public Teacher modifyTeacher(Integer id, Teacher dataTeacher)throws Exception{
        try{
            //Para modificar obviamente primero debo buscar
            //JPA me devuelve un DATO OPCIONAL (PUEDE ESTAR O NO
            Optional<Teacher> searchTeacher = this.repositorie.findById(id);

            //Apenas lo busques pregunta si si esta o no esta
            if(searchTeacher.isPresent()){
                //Si si lo encontro entonces se modifica
                //searchTeacher.get().getSubject(); //Trae un dato viejo
                searchTeacher.get().setSubject(dataTeacher.getSubject()); //Modificando un dato viejo
                return this.repositorie.save(searchTeacher.get());
            }else{
                //No lo encontro
                throw new Exception(MessagesAPI.DOCENTE_NO_ENCONTRADO.getTexto());
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Buscar por Id el servicio siempre devuelve el MODELO
    public Teacher searchTeacherId(Integer id) throws Exception{
        try{
            //El tipo de dato empieza en Mayuscula y el objeto empieza en minuscula
           Optional<Teacher> searchTeacher = this.repositorie.findById(id);

           //Busco siempre que busco debo preguntar
            if(searchTeacher.isPresent()){
                //Devuelvo o mas bien retorno el Docente que busco
                return searchTeacher.get();
            }else{
                //Mensaje de error
                throw new Exception(MessagesAPI.DOCENTE_NO_ENCONTRADO.getTexto());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Buscar todos
    public List<Teacher> searchAllTeacher() throws Exception{
        try{
            return this.repositorie.findAll();
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    //Eliminar, el unico metodo que no esta asociado al modelo es eliminar
    public boolean deleteTeacher(Integer id) throws Exception{
        try{
            Optional<Teacher> searchTeacher = this.repositorie.findById(id);
            if(searchTeacher.isPresent()){
                this.repositorie.deleteById(id);
                return true;
            }else{
                throw new Exception(MessagesAPI.DOCENTE_NO_ENCONTRADO.getTexto());
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
