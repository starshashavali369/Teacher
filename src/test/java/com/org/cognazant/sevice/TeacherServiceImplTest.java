package com.org.cognazant.sevice;

import com.org.cognazant.model.ModelClass;
import com.org.cognazant.repositary.TeacherRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeacherServiceImplTest {
    @InjectMocks
  private  TeacherServiceImpl teacherServiceImpl;

    @Mock
    private TeacherRepo teacherRepo;

    @Test
    void testCreateTeacher() {
      ModelClass modelClass=new ModelClass();
      modelClass.setId(100);
      modelClass.setName("rani");
      modelClass.setAddress("blr");
      teacherServiceImpl.createTeacher(modelClass);
      Mockito.verify(teacherRepo,Mockito.times(1)).save(modelClass);
    }

    @Test
    void testUpdateTeacher() {
      ModelClass modelClass=new ModelClass();
      modelClass.setId(100);
      modelClass.setName("rani");
      modelClass.setAddress("blr");
      teacherServiceImpl.updateTeacher(modelClass);
      Mockito.verify(teacherRepo,Mockito.times(1)).save(modelClass);
    }

    @Test
    void deleteById() {
      ModelClass modelClass=new ModelClass();
      modelClass.setId(106);
      modelClass.setName("raja");
      modelClass.setAddress("hyd");
      teacherServiceImpl.updateTeacher(modelClass );
      Mockito.verify(teacherRepo,Mockito.times(1));
    }

    @Test
    void updateParticularId() {
      ModelClass modelClass=new ModelClass();
      modelClass.setId(103);
      modelClass.setName("shasha");
      modelClass.setAddress("blr");
      teacherServiceImpl.updateParticularId()
      Mockito.verify(teacherRepo,Mockito.times(1)).save(modelClass);
    }

    @Test
    void getAll() {
    }

    @Test
    void getById() {
    }
}