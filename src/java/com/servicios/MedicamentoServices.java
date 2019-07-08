/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import com.dao.ImplDao;
import com.entity.Medicamento;
import com.implDao.IMedicamento;
import java.io.Serializable;

/**
 *
 * @author Jhon Baron
 */
public class MedicamentoServices extends ImplDao<Medicamento, Long> implements IMedicamento, Serializable{
    
}
