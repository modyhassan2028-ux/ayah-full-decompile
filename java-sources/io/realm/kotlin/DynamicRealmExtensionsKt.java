package io.realm.kotlin;

import N9.InterfaceC0415h;
import io.realm.DynamicRealm;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicRealmExtensionsKt {
    public static final InterfaceC0415h toflow(DynamicRealm dynamicRealm) {
        j.e(dynamicRealm, "<this>");
        InterfaceC0415h interfaceC0415hFrom = dynamicRealm.getConfiguration().getFlowFactory().from(dynamicRealm);
        j.d(interfaceC0415hFrom, "configuration.flowFactory.from(this)");
        return interfaceC0415hFrom;
    }
}
