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

public class btMaterial extends BulletBase {
	private long swigCPtr;
	
	protected btMaterial(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMaterial, normally you should not need this constructor it's intended for low-level usage. */ 
	public btMaterial(long cPtr, boolean cMemoryOwn) {
		this("btMaterial", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btMaterial obj) {
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
				CollisionJNI.delete_btMaterial(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setFriction(float value) {
    CollisionJNI.btMaterial_friction_set(swigCPtr, this, value);
  }

  public float getFriction() {
    return CollisionJNI.btMaterial_friction_get(swigCPtr, this);
  }

  public void setRestitution(float value) {
    CollisionJNI.btMaterial_restitution_set(swigCPtr, this, value);
  }

  public float getRestitution() {
    return CollisionJNI.btMaterial_restitution_get(swigCPtr, this);
  }

  public void setPad(int[] value) {
    CollisionJNI.btMaterial_pad_set(swigCPtr, this, value);
  }

  public int[] getPad() {
    return CollisionJNI.btMaterial_pad_get(swigCPtr, this);
  }

  public btMaterial() {
    this(CollisionJNI.new_btMaterial__SWIG_0(), true);
  }

  public btMaterial(float fric, float rest) {
    this(CollisionJNI.new_btMaterial__SWIG_1(fric, rest), true);
  }

}
