package _test;
import linear.List;
import linear.ListWithViewer;
import gui.GUI;
import baeume.BinaryTree;
import baeume.TreeViewer;

import java.util.ArrayList;
import java.util.Collections;


public class BinaryTreeTest {
	public BinaryTree<Integer> suchbaum;

	public BinaryTreeTest(){
		suchbaum = new BinaryTree<Integer>(59);
		BinaryTree<Integer> b4= new BinaryTree<Integer>(4);
		BinaryTree<Integer> b34 = new BinaryTree<Integer>(34);
		BinaryTree<Integer> b16 = new BinaryTree<Integer>(16);
		BinaryTree<Integer> b7= new BinaryTree<Integer>(7);
		BinaryTree<Integer> b6 = new BinaryTree<Integer>(6);
		BinaryTree<Integer> b12 = new BinaryTree<Integer>(12);
		BinaryTree<Integer> b18= new BinaryTree<Integer>(18);
		BinaryTree<Integer> b17= new BinaryTree<Integer>(17);
		BinaryTree<Integer> b53 = new BinaryTree<Integer>(53);
		BinaryTree<Integer> b45 = new BinaryTree<Integer>(45);
		BinaryTree<Integer> b78 = new BinaryTree<Integer>(78);
		BinaryTree<Integer> b62 = new BinaryTree<Integer>(62);
		BinaryTree<Integer> b61= new BinaryTree<Integer>(61);
		BinaryTree<Integer> b71 = new BinaryTree<Integer>(71);
		BinaryTree<Integer> b73 = new BinaryTree<Integer>(73);
		BinaryTree<Integer> b2= new BinaryTree<Integer>(2);
		BinaryTree<Integer> b65 = new BinaryTree<Integer>(65);
		BinaryTree<Integer> b83 = new BinaryTree<Integer>(83);

		suchbaum.setLeftTree(b4);
		b4.setRightTree(b34);
		b7.setLeftTree(b6);
		b7.setRightTree(b12);
		b16.setRightTree(b18);
		b18.setLeftTree(b17);
		b16.setLeftTree(b7);
		b34.setLeftTree(b16);
		b34.setRightTree(b53);
		b53.setLeftTree(b45);
		suchbaum.setRightTree(b78);
		b78.setLeftTree(b62);
		b62.setLeftTree(b61);
		b62.setRightTree(b71);
		b71.setRightTree(b73);
		b73.setLeftTree(b2);
		b2.setRightTree(b65);
		b65.setRightTree(b83);
		TreeViewer.showTree(suchbaum, 600, 400);
	}

	

	// Rahmenmethode
	public int summe(){
		return summe(suchbaum);
	}

	public int gibKnotenZahl() {
		return gibKnotenAnzahl(suchbaum);
	}
	
	public int gibTiefe() {
		return gibTiefe(suchbaum);
	}

	private int summe(BinaryTree<Integer> pTree) {
		int ergebnis = 0;

		// Abbruchbedingung
		if(pTree.isEmpty())return 0;

		//Wurzelbehandlung
		int wurzel = pTree.getContent();

		// 2 rekursive Aufrufe
		int leftErgeb = summe(pTree.getLeftTree());
		int rightErgeb = summe(pTree.getRightTree());

		ergebnis= leftErgeb+rightErgeb+wurzel;

		return ergebnis;
	}
	
	private int gibTiefe(BinaryTree<Integer> pTree) {
		int ergebnis = 0;
		
		// Abbruchbedingung
		if(pTree.isEmpty())return 0;

		// 2 rekursive Aufrufe
		int leftErgeb = gibTiefe(pTree.getLeftTree());
		int rightErgeb = gibTiefe(pTree.getRightTree());

		if(leftErgeb>rightErgeb) {
			return leftErgeb+1;
		}else
			return rightErgeb+1;
	}
	
	private int gibKnotenAnzahl(BinaryTree<Integer> pBaum){
		int ergebnis = 0;
		if(pBaum.isEmpty()){
			return 0;
		}
		int leftErg = gibKnotenAnzahl(pBaum.getLeftTree());
		int rightErg = gibKnotenAnzahl(pBaum.getRightTree());
		return leftErg + rightErg +1;
	}
	
	public boolean enthaelt(BinaryTree<Integer> pBaum, int pZahl) {
		if(pBaum.isEmpty()){
			return false;
		}
		
		int wurzel = pBaum.getContent();
		
		if(pZahl == wurzel) {
			return true;
		}
		
		boolean leftErg = enthaelt(pBaum.getLeftTree(), pZahl);
		boolean rightErg = enthaelt(pBaum.getRightTree(), pZahl);
		
		if(leftErg == true || rightErg == true) {
			return true;
		}else
			return false;
	}
	
	public int amWeitestenRechts(BinaryTree<Integer> pBaum) {
		int ergebnis = 0;
		BinaryTree<Integer> currentBaum = pBaum;
		
		while(!currentBaum.getRightTree().isEmpty()) {
			currentBaum = currentBaum.getRightTree();
			ergebnis = currentBaum.getContent();
		}
		
		return ergebnis;
	}
	
	public boolean einfuegen(BinaryTree<Integer> pBaum, int pZahl) {
		boolean ergebnis = false;
		
		if(pBaum.isEmpty()) return false;
		
		int wurzel = pBaum.getContent();
		
		if(pZahl > wurzel) {
			ergebnis = einfuegen(pBaum.getRightTree(), pZahl);
		}else
			ergebnis = einfuegen(pBaum.getLeftTree(), pZahl);
		
		BinaryTree<Integer> bPZahl = new BinaryTree<Integer>(pZahl);
		if(ergebnis == true) {
			if(pZahl > wurzel) {
				pBaum.setRightTree(bPZahl);
			}else
				pBaum.setLeftTree(bPZahl);
		}
		
		return false;
	}
	
	public ArrayList<Integer> gibBlaetterList(){
		return gibBlaetterList(suchbaum);
	}
	
	public ArrayList<Integer> gibBlaetterList(BinaryTree<Integer> tree){
		ArrayList<Integer> leafs = new ArrayList<>();
		
		// termination conditions
		if(tree == null || tree.isEmpty()) return leafs;
		
		// check if current tree is a leaf
		if(tree.getRightTree().isEmpty() && tree.getLeftTree().isEmpty()){
			leafs.add(tree.getContent());
		}
		
		if(!tree.getRightTree().isEmpty()){
			leafs.addAll(gibBlaetterList(tree.getRightTree()));
		}
		if(!tree.getLeftTree().isEmpty()){
			leafs.addAll(gibBlaetterList(tree.getLeftTree()));
		}
		
		return leafs;
	}
	
	public void printArrayList(ArrayList<Integer> list){
		StringBuilder builder = new StringBuilder();
		list.forEach(i->{
			builder.append(i + ",");
		});
		System.out.println(builder);
	}
	
	public static void main(String[] args) {
		new GUI(new BinaryTreeTest());
	}
}
