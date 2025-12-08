package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository tr;

	@Override
	public void add(Teacher t) {
		tr.save(t);
		// TODO Auto-generated method stub

	}

	@Override
	public List<Teacher> display() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

	@Override
	public void delete(Integer id) {
		tr.deleteById(id);
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Integer id, Teacher t) {
		// TODO Auto-generated method stub
		t.setId(id);
		tr.save(t);

	}

}
