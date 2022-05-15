package com.aglistech.springbootfirebase;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class CRUDService {

	public String createCRUD(CRUD crud) throws InterruptedException, ExecutionException {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> set = dbFirestore.collection("crud_user").document(crud.getName()).set(crud);
		return set.get().getUpdateTime().toString();
	}

	public CRUD getCRUD(String document_id) throws InterruptedException, ExecutionException {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		DocumentReference document = dbFirestore.collection("crud_user").document(document_id);
		ApiFuture<DocumentSnapshot> apiFuture = document.get();
		DocumentSnapshot documentSnapshot = apiFuture.get();
		CRUD crud;
		if (documentSnapshot.exists()) {
			System.out.println(documentSnapshot);
			crud = documentSnapshot.toObject(CRUD.class);
			return crud;
		}
		return null;
	}

	public String updateCRUD(CRUD crud) throws InterruptedException, ExecutionException {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> set = dbFirestore.collection("crud_user").document(crud.getName()).set(crud);
		return set.get().getUpdateTime().toString();
	}

	public String deleteCRUD(CRUD crud) {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> delete = dbFirestore.collection("crud_user").document(crud.getDocument_id()).delete();
		return "Successfully deleted " + crud.getDocument_id();
	}

}
