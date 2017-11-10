package com.goule666.himmaForDnf.dao;

import com.goule666.himmaForDnf.model.domain.HimmaRecordDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author niewenlong
 */
@Component
public interface HimmaRepository extends JpaRepository<HimmaRecordDO, Integer> {


}
