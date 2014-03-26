/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCollisionObjectConstArray extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionObjectConstArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCollisionObjectConstArray, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCollisionObjectConstArray(long cPtr, boolean cMemoryOwn) {
		this("btCollisionObjectConstArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionObjectConstArray obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btCollisionObjectConstArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btCollisionObjectConstArray() {
    this(CollisionJNI.new_btCollisionObjectConstArray__SWIG_0(), true);
  }

  public btCollisionObjectConstArray(btCollisionObjectConstArray otherArray) {
    this(CollisionJNI.new_btCollisionObjectConstArray__SWIG_1(btCollisionObjectConstArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return CollisionJNI.btCollisionObjectConstArray_size(swigCPtr, this);
  }

  public btCollisionObject at(int n) {
	return btCollisionObject.getInstance(CollisionJNI.btCollisionObjectConstArray_at__SWIG_0(swigCPtr, this, n), false);
}

  public void clear() {
    CollisionJNI.btCollisionObjectConstArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    CollisionJNI.btCollisionObjectConstArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    CollisionJNI.btCollisionObjectConstArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, btCollisionObject fillData) {
    CollisionJNI.btCollisionObjectConstArray_resize__SWIG_0(swigCPtr, this, newsize, btCollisionObject.getCPtr(fillData), fillData);
  }

  public void resize(int newsize) {
    CollisionJNI.btCollisionObjectConstArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public SWIGTYPE_p_p_btCollisionObject expandNonInitializing() {
    return new SWIGTYPE_p_p_btCollisionObject(CollisionJNI.btCollisionObjectConstArray_expandNonInitializing(swigCPtr, this), false);
  }

  public SWIGTYPE_p_p_btCollisionObject expand(btCollisionObject fillValue) {
    return new SWIGTYPE_p_p_btCollisionObject(CollisionJNI.btCollisionObjectConstArray_expand__SWIG_0(swigCPtr, this, btCollisionObject.getCPtr(fillValue), fillValue), false);
  }

  public SWIGTYPE_p_p_btCollisionObject expand() {
    return new SWIGTYPE_p_p_btCollisionObject(CollisionJNI.btCollisionObjectConstArray_expand__SWIG_1(swigCPtr, this), false);
  }

  public void push_back(btCollisionObject _Val) {
    CollisionJNI.btCollisionObjectConstArray_push_back(swigCPtr, this, btCollisionObject.getCPtr(_Val), _Val);
  }

  public int capacity() {
    return CollisionJNI.btCollisionObjectConstArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    CollisionJNI.btCollisionObjectConstArray_reserve(swigCPtr, this, _Count);
  }

  public void swap(int index0, int index1) {
    CollisionJNI.btCollisionObjectConstArray_swap(swigCPtr, this, index0, index1);
  }

  public int findBinarySearch(btCollisionObject key) {
    return CollisionJNI.btCollisionObjectConstArray_findBinarySearch(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public int findLinearSearch(btCollisionObject key) {
    return CollisionJNI.btCollisionObjectConstArray_findLinearSearch(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public void remove(btCollisionObject key) {
    CollisionJNI.btCollisionObjectConstArray_remove(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    CollisionJNI.btCollisionObjectConstArray_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btCollisionObjectConstArray otherArray) {
    CollisionJNI.btCollisionObjectConstArray_copyFromArray(swigCPtr, this, btCollisionObjectConstArray.getCPtr(otherArray), otherArray);
  }

}
