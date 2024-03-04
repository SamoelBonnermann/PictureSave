package com.Picture.test.repository;

import com.Picture.test.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {


}
