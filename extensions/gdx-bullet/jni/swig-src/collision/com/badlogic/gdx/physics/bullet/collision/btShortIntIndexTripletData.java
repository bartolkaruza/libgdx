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

public class btShortIntIndexTripletData extends BulletBase {
	private long swigCPtr;
	
	protected btShortIntIndexTripletData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btShortIntIndexTripletData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btShortIntIndexTripletData(long cPtr, boolean cMemoryOwn) {
		this("btShortIntIndexTripletData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btShortIntIndexTripletData obj) {
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
				CollisionJNI.delete_btShortIntIndexTripletData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setValues(short[] value) {
    CollisionJNI.btShortIntIndexTripletData_values_set(swigCPtr, this, value);
  }

  public short[] getValues() {
    return CollisionJNI.btShortIntIndexTripletData_values_get(swigCPtr, this);
  }

  public void setPad(String value) {
    CollisionJNI.btShortIntIndexTripletData_pad_set(swigCPtr, this, value);
  }

  public String getPad() {
    return CollisionJNI.btShortIntIndexTripletData_pad_get(swigCPtr, this);
  }

  public btShortIntIndexTripletData() {
    this(CollisionJNI.new_btShortIntIndexTripletData(), true);
  }

}
