package org.jsp.hibernate;

import java.util.List;

import org.jsp.hibernate.dto.UserDTO;
import org.jsp.hibernate.entity.UserDetails;
import org.jsp.hibernate.repository.UserHQLRepo;
import org.jsp.hibernate.repository.UserRepo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        UserDetails userDetails = new UserDetails();
//        userDetails.setName("SIMHA");
//        userDetails.setEmail("s@gmail.com");
//        userDetails.setPhoneNumber("543267890");
        
        UserRepo repo = new UserRepo();
//        repo.SaveOrUpdate(userDetails);
//        UserDetails id = repo.findId(3);
//        System.out.println(id);
        
        UserDTO dto = new UserDTO();
//        dto.setId(3);
//        dto.setName("REDDY");
//        dto.setEmail("r@gmail.com");
//        
//        repo.update(dto);
        
//        repo.delete(5);
        
        UserHQLRepo hqlRepo = new UserHQLRepo();
//        List<UserDetails> findAll = hqlRepo.findAll();
//        System.out.println(findAll);
        
//        List<UserDetails> findByName = hqlRepo.findByName("Tharak");
//        System.out.println(findByName);
        
//        hqlRepo.updatePhoneNumByEmail("6302226015", "t@gmail.com");
        
        hqlRepo.deleteById(3);
        
    }
}
