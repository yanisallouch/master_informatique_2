package state;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Vertex;

import umlutils.LoadUML;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Event;


public class TransfoState {
	Model handledModel;
	UMLFactory factory=UMLFactory.eINSTANCE;

	private Model getHandledModel() {
		return handledModel;
	}	
	public void initModel(){

		handledModel=LoadUML.chargerModele("model/modeleState.uml");
		System.out.println("modèle "+handledModel.getName()+" chargé");
	}

	public static void main (String[] args){
		TransfoState transfo=new TransfoState();
		transfo.initModel();

		Class context=transfo.findClassInPackage("MaClasseContexte",transfo.getHandledModel());
		System.out.println(transfo.getStateMachines(context));
		transfo.applyState(context);
		LoadUML.sauverModele("model/modelWithState.uml", transfo.getHandledModel());
	}


	public List<StateMachine> getStateMachines(Class c){
		ArrayList<StateMachine> result=new ArrayList<>();
		for (Behavior bc:c.getOwnedBehaviors()){
			if (bc instanceof StateMachine){
				result.add((StateMachine)bc);
			}
		}
		return result;
	}

	public StateMachine getStateMachine(Class c){
		return getStateMachines(c).get(0);
	}

	public boolean isWellFormed(StateMachine sm){
		return sm.getRegions().size()==1;
	}

	public List<State> getAllStates(StateMachine sm){
		ArrayList<State> result=new ArrayList<>();
		if (isWellFormed(sm)){
			for (Vertex v:sm.getRegions().get(0).getSubvertices()){
				if (v instanceof State){
					result.add((State)v);
				}
			}
		}
		return result;
	}
	public List<Operation> findOperationTriggers(StateMachine sm){
		ArrayList<Operation> result=new ArrayList<>();
		for (Transition t:sm.getRegions().get(0).getTransitions()){
			for (Trigger trig:t.getTriggers()){
				Event e=trig.getEvent();
				if (e instanceof CallEvent){
					Operation op=((CallEvent)e).getOperation();
					if (!result.contains(op)) {
						result.add(op);
					}
				}
			}
		}
		return result;
	}

	public EList<Class> createClassHierarchy(Class context){
		EList<Class> result=new BasicEList<>();
		// creation of the mother class
		Class mother=factory.createClass();
		mother.setName("State"+context.getName());
		mother.setIsAbstract(true);
		Package owner =(Package)context.getOwner();
		owner.getPackagedElements().add(mother);
		result.add(mother);
		// creation of daughters
		for(State s:getAllStates(getStateMachine(context))){
			Class daughter=factory.createClass();
			daughter.setName(s.getName());
			daughter.createGeneralization(mother);
			owner.getPackagedElements().add(daughter);
			result.add(daughter);
		}

		return result;
	}

	public void associateContextToMother(Class context, Class mother) {
		Association asso=factory.createAssociation();
		Property p1=factory.createProperty();
		p1.setName("currentState");
		p1.setLower(1);
		p1.setUpper(1);
		p1.setType(mother);
		Property p2=factory.createProperty();
		p2.setName("context");
		p2.setLower(0);
		p2.setUpper(1);
		p2.setType(context);
		asso.getMemberEnds().add(p1);
		asso.getMemberEnds().add(p2);
		context.getOwnedAttributes().add(p1);
		mother.getOwnedAttributes().add(p2);
		Package owner =(Package)context.getOwner();
		owner.getPackagedElements().add(asso);
	}

	public Class findClassInPackage(String name, Package p){
		Class c=null;
		for (PackageableElement pd:p.getPackagedElements()){
			if (pd instanceof Class){
				Class pdc=(Class)pd;
				if (pdc.getName().equals(name)){return pdc;}
			} else if (pd instanceof Package) {
				Package pdp=(Package)pd;
				c=findClassInPackage(name, pdp);
				if (c!=null){return c;}
			}
		}
		return c;
	}

	public void applyState(Class c) {
		if (getStateMachines(c).size()==1) {
			StateMachine sm=getStateMachine(c);
			if (isWellFormed(sm)) {
				List<Operation> stateDependantOperations=findOperationTriggers(sm);
				EList<Class> classes=createClassHierarchy(c);
				Class mother=classes.get(0);
				associateContextToMother(c, mother);
				for (Operation op : stateDependantOperations) {
					Operation opabs=EcoreUtil.copy(op);
					opabs.setIsAbstract(true);
					mother.getOwnedOperations().add(opabs);
					for (int i=1;i<classes.size();i++) {
						Class daughter=classes.get(i);
						Operation opredf=EcoreUtil.copy(op);
						opredf.getRedefinedOperations().add(opabs);
						daughter.getOwnedOperations().add(opredf);
					}
				}
			}
		}
	}

}
