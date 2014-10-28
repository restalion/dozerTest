package com.restalion.dozer;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;

import com.restalion.entities.Entity;
import com.restalion.entities.SubEntity;
import com.restalion.vo.EntityVO;

public class DozerTest {

	static public void main(String[] input) {
		Entity entity = new Entity();
		entity.setUno("uno");
		entity.setDos("dos");
		entity.setTres("tres");
		
		SubEntity subEntity = new SubEntity();
		subEntity.setA(1);
		subEntity.setB(2);
		subEntity.setC(3);
		
		SubEntity subEntity1 = new SubEntity();
		subEntity.setA(4);
		subEntity.setB(5);
		subEntity.setC(6);
		
		SubEntity subEntity2 = new SubEntity();
		subEntity.setA(7);
		subEntity.setB(8);
		subEntity.setC(9);
		
		List<SubEntity> subEntities = new ArrayList<SubEntity>();
		subEntities.add(subEntity1);
		subEntities.add(subEntity2);
		
		entity.setSubEntity(subEntity);
		entity.setSubEntities(subEntities);
		
		System.out.println("Entity to be transformed: " + entity);
		
		EntityVO entityVO =	mapObject(entity, EntityVO.class);
		
		System.out.println("VO after transformation: " + entityVO);
	}
	
	
    /**
     * Transform an entity to a VO and vice-versa, sets only the initialized
     * fields avoiding lazy initialization.
     * @param sourceObject
     *            the object to transform. If null, method will return null.
     * @param destinationObjectClass
     *            the target class.
     * @return the object transformed into the new class.
     */
    public static <T> T mapObject(Object sourceObject,
        Class<T> destinationObjectClass) {

        T destObject;

        if (sourceObject == null) {
            destObject = null;
        } else {
            DozerBeanMapper mapper = getDozerBeanMapperInstance();
            destObject = mapper.map(sourceObject, destinationObjectClass);
        }

        return destObject;
    }
    
    private static DozerBeanMapper getDozerBeanMapperInstance() {
    	
    	BeanMappingBuilder builder = new BeanMappingBuilder() {
    	      protected void configure() {
    	        mapping(Entity.class, EntityVO.class,
    	                TypeMappingOptions.oneWay())
    	                .exclude("subEntities")
    	                .exclude("tres")
    	                .fields("uno", "uno")
    	                .fields("dos", "dos")
    	        		.fields("subEntity", "subEntity");
    	      }
	    };
	
	    DozerBeanMapper mapper = new DozerBeanMapper();
	    mapper.addMapping(builder);
	    
	    return mapper;
    }
}
