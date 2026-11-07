package com.squareup.moshi;

import W.AbstractC0607v1;
import com.google.android.gms.internal.measurement.B1;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import j$.util.DesugarCollections;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.squareup.moshi.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0914a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15427a;

    public /* synthetic */ C0914a(int i10) {
        this.f15427a = i10;
    }

    public static void b(Type type, Class cls) {
        Class<?> clsF = B1.F(type);
        if (cls.isAssignableFrom(clsF)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsF.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.Set] */
    @Override // com.squareup.moshi.j
    public final JsonAdapter a(Type type, Set set, final C c10) {
        int i10;
        AbstractC0918e c0915b;
        Class cls;
        boolean z10;
        Class<?> cls2;
        boolean z11;
        i iVar;
        ?? linkedHashSet;
        Class clsF;
        Type[] actualTypeArguments;
        NullSafeJsonAdapter nullSafeJsonAdapterC;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type typeF = type;
        int i11 = this.f15427a;
        Class cls3 = Integer.TYPE;
        Class<?> cls4 = null;
        boolean z12 = true;
        switch (i11) {
            case 0:
                Type genericComponentType = typeF instanceof GenericArrayType ? ((GenericArrayType) typeF).getGenericComponentType() : typeF instanceof Class ? ((Class) typeF).getComponentType() : null;
                if (genericComponentType != null && set.isEmpty()) {
                    return new ArrayJsonAdapter(B1.F(genericComponentType), c10.b(genericComponentType, V8.d.f8425a, null)).c();
                }
                return null;
            case 1:
                if ((typeF instanceof Class) || (typeF instanceof ParameterizedType)) {
                    Class clsF2 = B1.F(typeF);
                    if (!clsF2.isInterface() && !clsF2.isEnum() && set.isEmpty()) {
                        if (V8.d.d(clsF2)) {
                            b(typeF, List.class);
                            b(typeF, Set.class);
                            b(typeF, Map.class);
                            b(typeF, Collection.class);
                            String str = "Platform " + clsF2;
                            if (typeF instanceof ParameterizedType) {
                                str = str + " in " + typeF;
                            }
                            throw new IllegalArgumentException(android.support.v4.media.session.p.z(str, " requires explicit JsonAdapter to be registered"));
                        }
                        if (clsF2.isAnonymousClass()) {
                            throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(clsF2.getName()));
                        }
                        if (clsF2.isLocalClass()) {
                            throw new IllegalArgumentException("Cannot serialize local class ".concat(clsF2.getName()));
                        }
                        if (clsF2.getEnclosingClass() != null && !Modifier.isStatic(clsF2.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(clsF2.getName()));
                        }
                        if (Modifier.isAbstract(clsF2.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsF2.getName()));
                        }
                        Class<? extends Annotation> cls5 = V8.d.f8428d;
                        if (cls5 != null && clsF2.isAnnotationPresent(cls5)) {
                            throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsF2.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                        }
                        try {
                            try {
                                try {
                                    Constructor declaredConstructor2 = clsF2.getDeclaredConstructor(null);
                                    declaredConstructor2.setAccessible(true);
                                    c0915b = new C0915b(declaredConstructor2, clsF2);
                                    i10 = 0;
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                    i10 = 0;
                                    try {
                                        try {
                                            Class[] clsArr = new Class[1];
                                            clsArr[i10] = Class.class;
                                            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", clsArr);
                                            declaredMethod.setAccessible(true);
                                            Object[] objArr2 = new Object[1];
                                            objArr2[i10] = Object.class;
                                            int iIntValue = ((Integer) declaredMethod.invoke(null, objArr2)).intValue();
                                            Class[] clsArr2 = new Class[2];
                                            clsArr2[i10] = Class.class;
                                            clsArr2[1] = cls3;
                                            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", clsArr2);
                                            declaredMethod2.setAccessible(true);
                                            c0915b = new C0917d(declaredMethod2, clsF2, iIntValue);
                                        } catch (Exception unused2) {
                                            throw new IllegalArgumentException("cannot construct instances of ".concat(clsF2.getName()));
                                        }
                                    } catch (IllegalAccessException unused3) {
                                        throw new AssertionError();
                                    } catch (NoSuchMethodException unused4) {
                                        Class[] clsArr3 = new Class[2];
                                        clsArr3[i10] = Class.class;
                                        clsArr3[1] = Class.class;
                                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", clsArr3);
                                        declaredMethod3.setAccessible(true);
                                        c0915b = new C0915b(declaredMethod3, clsF2);
                                    } catch (InvocationTargetException e10) {
                                        V8.d.g(e10);
                                        throw null;
                                    }
                                }
                            } catch (IllegalAccessException unused5) {
                                throw new AssertionError();
                            }
                            break;
                        } catch (NoSuchMethodException unused6) {
                            Class<?> cls6 = Class.forName("sun.misc.Unsafe");
                            Field declaredField = cls6.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            i10 = 0;
                            try {
                                c0915b = new C0916c(cls6.getMethod("allocateInstance", Class.class), declaredField.get(null), clsF2);
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                                Class[] clsArr4 = new Class[1];
                                clsArr4[i10] = Class.class;
                                Method declaredMethod4 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", clsArr4);
                                declaredMethod4.setAccessible(true);
                                Object[] objArr3 = new Object[1];
                                objArr3[i10] = Object.class;
                                int iIntValue2 = ((Integer) declaredMethod4.invoke(null, objArr3)).intValue();
                                Class[] clsArr5 = new Class[2];
                                clsArr5[i10] = Class.class;
                                clsArr5[1] = cls3;
                                Method declaredMethod5 = ObjectStreamClass.class.getDeclaredMethod("newInstance", clsArr5);
                                declaredMethod5.setAccessible(true);
                                c0915b = new C0917d(declaredMethod5, clsF2, iIntValue2);
                            }
                            break;
                        }
                        TreeMap treeMap = new TreeMap();
                        while (typeF != Object.class) {
                            Class clsF3 = B1.F(typeF);
                            boolean zD = V8.d.d(clsF3);
                            Field[] declaredFields = clsF3.getDeclaredFields();
                            int length = declaredFields.length;
                            int i12 = i10;
                            while (i12 < length) {
                                Field field = declaredFields[i12];
                                int modifiers = field.getModifiers();
                                if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!(Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zD) || ((iVar = (i) field.getAnnotation(i.class)) != null && iVar.ignore()))) {
                                    cls = clsF3;
                                    z10 = zD;
                                    cls2 = cls4;
                                    z11 = z12;
                                } else {
                                    cls2 = cls4;
                                    Type typeF2 = V8.d.f(typeF, clsF3, field.getGenericType(), new LinkedHashSet());
                                    Annotation[] annotations = field.getAnnotations();
                                    int length2 = annotations.length;
                                    int i13 = i10;
                                    ?? r18 = cls2;
                                    while (i13 < length2) {
                                        int i14 = i13;
                                        Annotation annotation = annotations[i14];
                                        Class cls7 = clsF3;
                                        boolean z13 = zD;
                                        if (annotation.annotationType().isAnnotationPresent(l.class)) {
                                            if (r18 == 0) {
                                                linkedHashSet = new LinkedHashSet();
                                            }
                                            ?? r10 = linkedHashSet;
                                            r10.add(annotation);
                                            r18 = r10;
                                        } else {
                                            linkedHashSet = r18;
                                        }
                                        i13 = i14 + 1;
                                        clsF3 = cls7;
                                        zD = z13;
                                        r18 = r18;
                                    }
                                    cls = clsF3;
                                    z10 = zD;
                                    Set setUnmodifiableSet = r18 != 0 ? DesugarCollections.unmodifiableSet(r18) : V8.d.f8425a;
                                    String name = field.getName();
                                    JsonAdapter jsonAdapterB = c10.b(typeF2, setUnmodifiableSet, name);
                                    z11 = true;
                                    field.setAccessible(true);
                                    if (iVar != null) {
                                        String strName = iVar.name();
                                        if (!"\u0000".equals(strName)) {
                                            name = strName;
                                        }
                                    }
                                    f fVar = (f) treeMap.put(name, new f(name, field, jsonAdapterB));
                                    if (fVar != null) {
                                        throw new IllegalArgumentException("Conflicting fields:\n    " + fVar.f15444b + "\n    " + field);
                                    }
                                }
                                i12++;
                                clsF3 = cls;
                                z12 = z11;
                                cls4 = cls2;
                                zD = z10;
                            }
                            Class clsF4 = B1.F(typeF);
                            typeF = V8.d.f(typeF, clsF4, clsF4.getGenericSuperclass(), new LinkedHashSet());
                        }
                        return new ClassJsonAdapter(c0915b, treeMap).c();
                    }
                }
                return null;
            case 2:
                if (!set.isEmpty() || (clsF = B1.F(typeF)) != Map.class) {
                    return null;
                }
                if (typeF == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(clsF)) {
                        throw new IllegalArgumentException();
                    }
                    Type typeF3 = V8.d.f(typeF, clsF, V8.d.c(typeF, clsF, Map.class), new LinkedHashSet());
                    actualTypeArguments = typeF3 instanceof ParameterizedType ? ((ParameterizedType) typeF3).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }
                return new MapJsonAdapter(c10, actualTypeArguments[0], actualTypeArguments[1]).c();
            case 3:
                if (!set.isEmpty()) {
                    return null;
                }
                if (typeF == Boolean.TYPE) {
                    return E.f15420b;
                }
                if (typeF == Byte.TYPE) {
                    return E.f15421c;
                }
                if (typeF == Character.TYPE) {
                    return E.f15422d;
                }
                if (typeF == Double.TYPE) {
                    return E.f15423e;
                }
                if (typeF == Float.TYPE) {
                    return E.f15424f;
                }
                if (typeF == cls3) {
                    return E.g;
                }
                if (typeF == Long.TYPE) {
                    return E.f15425h;
                }
                if (typeF == Short.TYPE) {
                    return E.f15426i;
                }
                if (typeF == Boolean.class) {
                    return E.f15420b.c();
                }
                if (typeF == Byte.class) {
                    return E.f15421c.c();
                }
                if (typeF == Character.class) {
                    return E.f15422d.c();
                }
                if (typeF == Double.class) {
                    return E.f15423e.c();
                }
                if (typeF == Float.class) {
                    return E.f15424f.c();
                }
                if (typeF == Integer.class) {
                    return E.g.c();
                }
                if (typeF == Long.class) {
                    return E.f15425h.c();
                }
                if (typeF == Short.class) {
                    return E.f15426i.c();
                }
                if (typeF == String.class) {
                    return E.j.c();
                }
                if (typeF == Object.class) {
                    return new JsonAdapter<Object>(c10) { // from class: com.squareup.moshi.StandardJsonAdapters$ObjectJsonAdapter
                        private final JsonAdapter<Boolean> booleanAdapter;
                        private final JsonAdapter<Double> doubleAdapter;
                        private final JsonAdapter<List> listJsonAdapter;
                        private final JsonAdapter<Map> mapAdapter;
                        private final C moshi;
                        private final JsonAdapter<String> stringAdapter;

                        {
                            this.moshi = c10;
                            this.listJsonAdapter = c10.a(List.class);
                            this.mapAdapter = c10.a(Map.class);
                            this.stringAdapter = c10.a(String.class);
                            this.doubleAdapter = c10.a(Double.class);
                            this.booleanAdapter = c10.a(Boolean.class);
                        }

                        @Override // com.squareup.moshi.JsonAdapter
                        public final Object a(n nVar) {
                            int iB = AbstractC0607v1.b(nVar.N());
                            if (iB == 0) {
                                return this.listJsonAdapter.a(nVar);
                            }
                            if (iB == 2) {
                                return this.mapAdapter.a(nVar);
                            }
                            if (iB == 5) {
                                return this.stringAdapter.a(nVar);
                            }
                            if (iB == 6) {
                                return this.doubleAdapter.a(nVar);
                            }
                            if (iB == 7) {
                                return this.booleanAdapter.a(nVar);
                            }
                            if (iB == 8) {
                                nVar.H();
                                return null;
                            }
                            throw new IllegalStateException("Expected a value but was " + android.support.v4.media.session.p.G(nVar.N()) + " at path " + nVar.s());
                        }

                        /* JADX WARN: Code duplicated, block: B:8:0x0019 A[PHI: r2
                          0x0019: PHI (r2v3 java.lang.Class<?>) = (r2v0 java.lang.Class<?>), (r2v1 java.lang.Class<?>) binds: [B:7:0x0017, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // com.squareup.moshi.JsonAdapter
                        public final void e(s sVar, Object obj) {
                            Class<?> cls8 = obj.getClass();
                            if (cls8 == Object.class) {
                                sVar.e();
                                sVar.i();
                                return;
                            }
                            C c11 = this.moshi;
                            Class<?> cls9 = Map.class;
                            if (cls9.isAssignableFrom(cls8)) {
                                cls8 = cls9;
                            } else {
                                cls9 = Collection.class;
                                if (cls9.isAssignableFrom(cls8)) {
                                    cls8 = cls9;
                                }
                            }
                            c11.b(cls8, V8.d.f8425a, null).e(sVar, obj);
                        }

                        public final String toString() {
                            return "JsonAdapter(Object)";
                        }
                    }.c();
                }
                final Class clsF5 = B1.F(typeF);
                Set set2 = V8.d.f8425a;
                k kVar = (k) clsF5.getAnnotation(k.class);
                if (kVar != null && kVar.generateAdapter()) {
                    try {
                        try {
                            Class<?> cls8 = Class.forName(clsF5.getName().replace("$", "_") + "JsonAdapter", true, clsF5.getClassLoader());
                            try {
                                if (typeF instanceof ParameterizedType) {
                                    Type[] actualTypeArguments2 = ((ParameterizedType) typeF).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls8.getDeclaredConstructor(C.class, Type[].class);
                                        objArr = new Object[]{c10, actualTypeArguments2};
                                    } catch (NoSuchMethodException unused8) {
                                        declaredConstructor = cls8.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments2};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls8.getDeclaredConstructor(C.class);
                                        objArr = new Object[]{c10};
                                    } catch (NoSuchMethodException unused9) {
                                        declaredConstructor = cls8.getDeclaredConstructor(null);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                nullSafeJsonAdapterC = ((JsonAdapter) declaredConstructor.newInstance(objArr)).c();
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                cls4 = cls8;
                                if ((typeF instanceof ParameterizedType) || cls4.getTypeParameters().length == 0) {
                                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + typeF, e);
                                }
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + typeF + "'. Suspiciously, the type was not parameterized but the target class '" + cls4.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                            }
                        } catch (NoSuchMethodException e12) {
                            e = e12;
                        }
                    } catch (ClassNotFoundException e13) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter class for " + typeF, e13);
                    } catch (IllegalAccessException e14) {
                        throw new RuntimeException("Failed to access the generated JsonAdapter for " + typeF, e14);
                    } catch (InstantiationException e15) {
                        throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + typeF, e15);
                    } catch (InvocationTargetException e16) {
                        V8.d.g(e16);
                        throw null;
                    }
                    break;
                } else {
                    nullSafeJsonAdapterC = null;
                }
                if (nullSafeJsonAdapterC != null) {
                    return nullSafeJsonAdapterC;
                }
                if (clsF5.isEnum()) {
                    return new JsonAdapter<T>(clsF5) { // from class: com.squareup.moshi.StandardJsonAdapters$EnumJsonAdapter
                        private final T[] constants;
                        private final Class<T> enumType;
                        private final String[] nameStrings;
                        private final m options;

                        {
                            this.enumType = clsF5;
                            try {
                                T[] enumConstants = clsF5.getEnumConstants();
                                this.constants = enumConstants;
                                this.nameStrings = new String[enumConstants.length];
                                int i15 = 0;
                                while (true) {
                                    T[] tArr = this.constants;
                                    if (i15 >= tArr.length) {
                                        this.options = m.a(this.nameStrings);
                                        return;
                                    }
                                    String strName2 = tArr[i15].name();
                                    String[] strArr = this.nameStrings;
                                    Field field2 = clsF5.getField(strName2);
                                    Set set3 = V8.d.f8425a;
                                    i iVar2 = (i) field2.getAnnotation(i.class);
                                    if (iVar2 != null) {
                                        String strName3 = iVar2.name();
                                        if (!"\u0000".equals(strName3)) {
                                            strName2 = strName3;
                                        }
                                    }
                                    strArr[i15] = strName2;
                                    i15++;
                                }
                            } catch (NoSuchFieldException e17) {
                                throw new AssertionError("Missing field in ".concat(clsF5.getName()), e17);
                            }
                        }

                        @Override // com.squareup.moshi.JsonAdapter
                        public final Object a(n nVar) {
                            int iX = nVar.X(this.options);
                            if (iX != -1) {
                                return this.constants[iX];
                            }
                            String strS = nVar.s();
                            throw new A6.a("Expected one of " + Arrays.asList(this.nameStrings) + " but was " + nVar.L() + " at path " + strS);
                        }

                        @Override // com.squareup.moshi.JsonAdapter
                        public final void e(s sVar, Object obj) {
                            sVar.N(this.nameStrings[((Enum) obj).ordinal()]);
                        }

                        public final String toString() {
                            return "JsonAdapter(" + this.enumType.getName() + ")";
                        }
                    }.c();
                }
                return null;
            default:
                return null;
        }
    }
}
