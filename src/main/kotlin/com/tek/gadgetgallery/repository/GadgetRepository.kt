package com.tek.gadgetgallery.repository

import com.tek.gadgetgallery.model.Gadget
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GadgetRepository : JpaRepository<Gadget, Long>