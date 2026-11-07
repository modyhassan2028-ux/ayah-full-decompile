package com.squareup.moshi;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class Rfc3339DateJsonAdapter extends JsonAdapter<Date> {
    private final com.squareup.moshi.adapters.Rfc3339DateJsonAdapter delegate = new com.squareup.moshi.adapters.Rfc3339DateJsonAdapter();

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        return this.delegate.a(nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this.delegate) {
            try {
                if (date == null) {
                    sVar.A();
                } else {
                    sVar.N(com.squareup.moshi.adapters.a.b(date));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
