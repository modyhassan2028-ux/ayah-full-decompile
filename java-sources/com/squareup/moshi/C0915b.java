package com.squareup.moshi;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.squareup.moshi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0915b extends AbstractC0918e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15434a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f15435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccessibleObject f15436c;

    public C0915b(Constructor constructor, Class cls) {
        this.f15436c = constructor;
        this.f15435b = cls;
    }

    @Override // com.squareup.moshi.AbstractC0918e
    public final Object a() {
        int i10 = this.f15434a;
        AccessibleObject accessibleObject = this.f15436c;
        switch (i10) {
            case 0:
                return ((Constructor) accessibleObject).newInstance(null);
            default:
                return ((Method) accessibleObject).invoke(null, this.f15435b, Object.class);
        }
    }

    public final String toString() {
        switch (this.f15434a) {
            case 0:
                break;
        }
        return this.f15435b.getName();
    }

    public C0915b(Method method, Class cls) {
        this.f15436c = method;
        this.f15435b = cls;
    }
}
