package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
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
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f12387a;

    static {
        char[] cArr = new char[80];
        f12387a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f12387a, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i10, sb);
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
            C0733g c0733g = C0733g.f12451t;
            sb.append(AbstractC0813f2.u(new C0733g(((String) obj).getBytes(AbstractC0748w.f12518a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0733g) {
            sb.append(": \"");
            sb.append(AbstractC0813f2.u((C0733g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0746u) {
            sb.append(" {");
            c((AbstractC0746u) obj, sb, i10 + 2);
            sb.append("\n");
            a(i10, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        b(sb, i12, "key", entry.getKey());
        b(sb, i12, "value", entry.getValue());
        sb.append("\n");
        a(i10, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0202  */
    /* JADX WARN: Code duplicated, block: B:106:0x0204  */
    /* JADX WARN: Code duplicated, block: B:108:0x0212  */
    /* JADX WARN: Code duplicated, block: B:127:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01de  */
    public static void c(AbstractC0746u abstractC0746u, StringBuilder sb, int i10) {
        int i11;
        int i12;
        Method method;
        Method method2;
        Object objE;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0746u.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method5 = declaredMethods[i13];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith(CollectionUtils.SET_TYPE)) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (method4.getReturnType().equals(List.class)) {
                    b(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0746u.e(method4, abstractC0746u, new Object[0]));
                }
                i11 = i12;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0746u.e(method3, abstractC0746u, new Object[0]));
            } else if (hashSet.contains(CollectionUtils.SET_TYPE.concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objE = AbstractC0746u.e(method, abstractC0746u, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objE instanceof Boolean) {
                                    zEquals = !((Boolean) objE).booleanValue();
                                } else if (objE instanceof Integer) {
                                    if (((Integer) objE).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objE instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objE).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objE instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objE).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objE instanceof String) {
                                    zEquals = objE.equals("");
                                } else if (objE instanceof C0733g) {
                                    zEquals = objE.equals(C0733g.f12451t);
                                } else if ((objE instanceof AbstractC0727a) ? !((objE instanceof Enum) && ((Enum) objE).ordinal() == 0) : objE != ((AbstractC0746u) ((AbstractC0746u) ((AbstractC0727a) objE)).c(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC0746u.e(method2, abstractC0746u, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i10, strSubstring, objE);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objE = AbstractC0746u.e(method, abstractC0746u, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objE instanceof Boolean) {
                                zEquals = !((Boolean) objE).booleanValue();
                            } else if (objE instanceof Integer) {
                                if (((Integer) objE).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objE instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objE).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objE instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objE).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objE instanceof String) {
                                zEquals = objE.equals("");
                            } else if (objE instanceof C0733g) {
                                zEquals = objE.equals(C0733g.f12451t);
                            } else if (objE instanceof AbstractC0727a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC0746u.e(method2, abstractC0746u, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i10, strSubstring, objE);
                        }
                    }
                }
            }
            i11 = i12;
        }
        d0 d0Var = abstractC0746u.unknownFields;
        if (d0Var != null) {
            for (int i14 = 0; i14 < d0Var.f12443a; i14++) {
                b(sb, i10, String.valueOf(d0Var.f12444b[i14] >>> 3), d0Var.f12445c[i14]);
            }
        }
    }
}
