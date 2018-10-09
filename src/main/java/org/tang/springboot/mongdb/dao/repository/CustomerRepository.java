package org.tang.springboot.mongdb.dao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.tang.springboot.mongdb.dao.entity.Customer;

import java.util.List;

/**
 * 客户数据访问服务
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2018/3/3
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

}
