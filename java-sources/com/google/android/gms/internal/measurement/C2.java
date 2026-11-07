package com.google.android.gms.internal.measurement;

import io.realm.CollectionUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f13999a;

    static {
        char[] cArr = new char[80];
        f13999a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i10, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            Z1 z10 = Z1.f14184t;
            sb.append(Y2.a.n0(new Z1(((String) obj).getBytes(AbstractC0863p2.f14382a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof Z1) {
            sb.append(": \"");
            sb.append(Y2.a.n0((Z1) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0828i2) {
            sb.append(" {");
            b((AbstractC0828i2) obj, sb, i10 + 2);
            sb.append("\n");
            c(i10, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i12, "key", entry.getKey());
        a(sb, i12, "value", entry.getValue());
        sb.append("\n");
        c(i10, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0204  */
    public static void b(AbstractC0828i2 abstractC0828i2, StringBuilder sb, int i10) {
        int i11;
        int i12;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0828i2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith(CollectionUtils.SET_TYPE)) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0828i2.n(method2, abstractC0828i2, new Object[0]));
                }
                i11 = i12;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0828i2.n(method, abstractC0828i2, new Object[0]));
            } else if (hashSet.contains(CollectionUtils.SET_TYPE.concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objN = AbstractC0828i2.n(method4, abstractC0828i2, new Object[0]);
                    if (method5 == null) {
                        if (objN instanceof Boolean) {
                            if (((Boolean) objN).booleanValue()) {
                                a(sb, i10, strSubstring, objN);
                            }
                        } else if (objN instanceof Integer) {
                            if (((Integer) objN).intValue() != 0) {
                                a(sb, i10, strSubstring, objN);
                            }
                        } else if (objN instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objN).floatValue()) != 0) {
                                a(sb, i10, strSubstring, objN);
                            }
                        } else if (!(objN instanceof Double)) {
                            if (objN instanceof String) {
                                zEquals = objN.equals("");
                            } else if (objN instanceof Z1) {
                                zEquals = objN.equals(Z1.f14184t);
                            } else if (objN instanceof T1) {
                                if (objN != ((AbstractC0828i2) ((AbstractC0828i2) ((T1) objN)).o(6))) {
                                    a(sb, i10, strSubstring, objN);
                                }
                            } else if (!(objN instanceof Enum) || ((Enum) objN).ordinal() != 0) {
                                a(sb, i10, strSubstring, objN);
                            }
                            if (!zEquals) {
                                a(sb, i10, strSubstring, objN);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objN).doubleValue()) != 0) {
                            a(sb, i10, strSubstring, objN);
                        }
                    } else if (((Boolean) AbstractC0828i2.n(method5, abstractC0828i2, new Object[0])).booleanValue()) {
                        a(sb, i10, strSubstring, objN);
                    }
                }
            }
            i11 = i12;
        }
        O2 o10 = abstractC0828i2.zzc;
        if (o10 != null) {
            for (int i14 = 0; i14 < o10.f14092a; i14++) {
                a(sb, i10, String.valueOf(o10.f14093b[i14] >>> 3), o10.f14094c[i14]);
            }
        }
    }

    public static void c(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f13999a, 0, i11);
            i10 -= i11;
        }
    }
}
