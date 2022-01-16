package com.languages.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository <Language, Long> {
	List<Language> findAll();

}
