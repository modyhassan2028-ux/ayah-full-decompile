package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0753b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12647a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12648b;

    public C0753b(HashMap map) {
        this.f12648b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0766o enumC0766o = (EnumC0766o) entry.getValue();
            List arrayList = (List) this.f12647a.get(enumC0766o);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f12647a.put(enumC0766o, arrayList);
            }
            arrayList.add((C0754c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0754c c0754c = (C0754c) list.get(size);
                Method method = c0754c.f12650b;
                try {
                    int i10 = c0754c.f12649a;
                    if (i10 == 0) {
                        method.invoke(obj, null);
                    } else if (i10 == 1) {
                        method.invoke(obj, interfaceC0771u);
                    } else if (i10 == 2) {
                        method.invoke(obj, interfaceC0771u, enumC0766o);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
