package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Instance;
import mx.utng.practice.repository.InstanceRepository;

@Named
@ViewScoped
public class InstanceController {

	@Autowired
	private InstanceRepository instanceRepository;
	private Instance instance = new Instance();
   private List<Instance> instances;
   private boolean editMode = false;
   
   @PostConstruct
	public void init(){
	   setInstances(instanceRepository.finAll());
	}
	public void save(){
		instanceRepository.save(instance);
		if(!editMode){
		 getInstances().add(instance);
		}
		
		instance = new Instance();
		setEditMode(false);
		
		}
	
	public void delete(Instance instance){
		instanceRepository.delete(instance);
		instances.remove(instance);
	}
	
	public void update(Instance instance){
		setInstance(instance);
		setEditMode(true);
	}
	public void cancel(){
		instance = new Instance();
		setEditMode(false);
	}
	public InstanceRepository getInstanceRepository() {
		return instanceRepository;
	}
	public void setInstanceRepository(InstanceRepository instanceRepository) {
		this.instanceRepository = instanceRepository;
	}
	public Instance getInstance() {
		return instance;
	}
	public void setInstance(Instance instance) {
		this.instance = instance;
	}
	public List<Instance> getInstances() {
		return instances;
	}
	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}
	public boolean isEditMode() {
		return editMode;
	}
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
}
