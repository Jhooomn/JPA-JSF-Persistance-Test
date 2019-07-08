/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import com.dao.ImplDao;
import com.entity.Paciente;
import com.implDao.IPaciente;
import java.io.Serializable;

/**
 *
 * @author Jhon Baron
 */
public class PacienteServices extends ImplDao<Paciente, Long> implements IPaciente, Serializable{
    
}
