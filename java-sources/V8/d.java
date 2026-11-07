package V8;

import com.squareup.moshi.n;
import j$.util.DesugarCollections;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f8425a = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type[] f8426b = new Type[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f8427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Class f8428d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f8428d = cls;
        f8427c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static Type c(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean d(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static A6.a e(String str, String str2, n nVar) {
        String str3;
        String strS = nVar.s();
        if (str2.equals(str)) {
            str3 = "Required value '" + str + "' missing at " + strS;
        } else {
            str3 = "Required value '" + str + "' (JSON name '" + str2 + "') missing at " + strS;
        }
        return new A6.a(str3);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    public static Type f(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type type3;
        WildcardType wildcardType;
        Type[] lowerBounds;
        TypeVariable typeVariable;
        do {
            int i10 = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeF = f(type, cls, componentType, linkedHashSet);
                        return componentType == typeF ? cls2 : new a(typeF);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeF2 = f(type, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == typeF2 ? genericArrayType : new a(typeF2);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeF3 = f(type, cls, ownerType, linkedHashSet);
                    boolean z10 = typeF3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i10 < length) {
                        Type typeF4 = f(type, cls, actualTypeArguments[i10], linkedHashSet);
                        if (typeF4 != actualTypeArguments[i10]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i10] = typeF4;
                        }
                        i10++;
                    }
                    return z10 ? new b(typeF3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type2 instanceof WildcardType) {
                    wildcardType = (WildcardType) type2;
                    Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds2.length == 1) {
                        Type typeF5 = f(type, cls, lowerBounds2[0], linkedHashSet);
                        if (typeF5 != lowerBounds2[0]) {
                            if (typeF5 instanceof WildcardType) {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = ((WildcardType) typeF5).getLowerBounds();
                            } else {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = new Type[]{typeF5};
                            }
                            return new c(new Type[]{Object.class}, lowerBounds);
                        }
                    } else if (upperBounds.length == 1) {
                        type3 = type2;
                        type3 = wildcardType;
                        Type typeF6 = f(type, cls, upperBounds[0], linkedHashSet);
                        type3 = wildcardType;
                        if (typeF6 != upperBounds[0]) {
                            return new c(typeF6 instanceof WildcardType ? ((WildcardType) typeF6).getUpperBounds() : new Type[]{typeF6}, f8426b);
                        }
                    }
                }
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                return type3;
            }
            typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type2 = typeVariable;
            } else {
                Type typeC = c(type, cls, cls3);
                if (typeC instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i10 >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i10])) {
                            type2 = ((ParameterizedType) typeC).getActualTypeArguments()[i10];
                            break;
                        }
                        i10++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static void g(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static String h(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static String i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static A6.a j(String str, String str2, n nVar) {
        String str3;
        String strS = nVar.s();
        if (str2.equals(str)) {
            str3 = "Non-null value '" + str + "' was null at " + strS;
        } else {
            str3 = "Non-null value '" + str + "' (JSON name '" + str2 + "') was null at " + strS;
        }
        return new A6.a(str3);
    }
}
