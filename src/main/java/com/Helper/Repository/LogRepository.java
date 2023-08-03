package com.Helper.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Helper.Model.Log;
public interface LogRepository extends JpaRepository<Log, Integer>
{

}