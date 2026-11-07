package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0879t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14409b;

    public /* synthetic */ C0879t(Object obj, Object obj2) {
        this.f14408a = obj;
        this.f14409b = obj2;
    }

    public Object a() {
        String string;
        J1 j10 = (J1) this.f14408a;
        String str = (String) this.f14409b;
        Context context = (Context) j10.f14056c;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        p213v8.b bVar = AbstractC0911z1.f14515a;
        if (contentResolver == null) {
            bVar.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (bVar) {
            try {
                if (((HashMap) bVar.f23379b) == null) {
                    ((AtomicBoolean) bVar.f23378a).set(false);
                    bVar.f23379b = new HashMap(16, 1.0f);
                    bVar.g = new Object();
                    contentResolver.registerContentObserver(A1.f13990a, true, new K0.n1(bVar));
                } else if (((AtomicBoolean) bVar.f23378a).getAndSet(false)) {
                    ((HashMap) bVar.f23379b).clear();
                    ((HashMap) bVar.f23380c).clear();
                    ((HashMap) bVar.f23381d).clear();
                    ((HashMap) bVar.f23382e).clear();
                    ((HashMap) bVar.f23383f).clear();
                    bVar.g = new Object();
                }
                Object obj = bVar.g;
                String str2 = null;
                if (((HashMap) bVar.f23379b).containsKey(str)) {
                    String str3 = (String) ((HashMap) bVar.f23379b).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    Uri uri = A1.f13990a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new C1("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new C1("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (bVar) {
                                    try {
                                        if (obj == bVar.g) {
                                            ((HashMap) bVar.f23379b).put(str, string);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } catch (Throwable th2) {
                                if (cursorQuery == null) {
                                    throw th2;
                                }
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (RemoteException e10) {
                            throw new C1("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                } catch (C1 unused) {
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public void b(C0874s c0874s) {
        ArrayList arrayList = c0874s.f14392a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((HashMap) this.f14408a).put(Integer.valueOf(((EnumC0894w) obj).f14497r).toString(), c0874s);
        }
    }

    public InterfaceC0850n c(Aa.a aVar, InterfaceC0850n interfaceC0850n) {
        p185s8.u0.R(aVar);
        if (!(interfaceC0850n instanceof C0855o)) {
            return interfaceC0850n;
        }
        C0855o c0855o = (C0855o) interfaceC0850n;
        ArrayList arrayList = c0855o.f14377s;
        String str = c0855o.f14376r;
        HashMap map = (HashMap) this.f14408a;
        return (map.containsKey(str) ? (C0874s) map.get(str) : (C0874s) this.f14409b).a(str, aVar, arrayList);
    }

    public void d(Aa.a aVar, android.support.v4.media.session.r rVar) {
        X1 x9 = new X1(rVar);
        TreeMap treeMap = (TreeMap) this.f14408a;
        for (Integer num : treeMap.keySet()) {
            C0790b c0790bClone = ((C0790b) rVar.f11365t).clone();
            InterfaceC0850n interfaceC0850nA = ((C0845m) treeMap.get(num)).a(aVar, Collections.singletonList(x9));
            int iN = interfaceC0850nA instanceof C0815g ? p185s8.u0.N(((C0815g) interfaceC0850nA).f14246r.doubleValue()) : -1;
            if (iN == 2 || iN == -1) {
                rVar.f11365t = c0790bClone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f14409b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC0850n interfaceC0850nA2 = ((C0845m) treeMap2.get((Integer) it.next())).a(aVar, Collections.singletonList(x9));
            if (interfaceC0850nA2 instanceof C0815g) {
                p185s8.u0.N(((C0815g) interfaceC0850nA2).f14246r.doubleValue());
            }
        }
    }

    public C0879t(int i10) {
        switch (i10) {
            case 3:
                this.f14408a = new TreeMap();
                this.f14409b = new TreeMap();
                break;
            default:
                this.f14408a = new HashMap();
                this.f14409b = new C0874s(6);
                C0874s c0874s = new C0874s(0);
                EnumC0894w enumC0894w = EnumC0894w.BITWISE_AND;
                ArrayList arrayList = c0874s.f14392a;
                arrayList.add(enumC0894w);
                arrayList.add(EnumC0894w.BITWISE_LEFT_SHIFT);
                arrayList.add(EnumC0894w.BITWISE_NOT);
                arrayList.add(EnumC0894w.BITWISE_OR);
                arrayList.add(EnumC0894w.BITWISE_RIGHT_SHIFT);
                arrayList.add(EnumC0894w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(EnumC0894w.BITWISE_XOR);
                b(c0874s);
                C0874s c0874s2 = new C0874s(1);
                EnumC0894w enumC0894w2 = EnumC0894w.EQUALS;
                ArrayList arrayList2 = c0874s2.f14392a;
                arrayList2.add(enumC0894w2);
                arrayList2.add(EnumC0894w.GREATER_THAN);
                arrayList2.add(EnumC0894w.GREATER_THAN_EQUALS);
                arrayList2.add(EnumC0894w.IDENTITY_EQUALS);
                arrayList2.add(EnumC0894w.IDENTITY_NOT_EQUALS);
                arrayList2.add(EnumC0894w.LESS_THAN);
                arrayList2.add(EnumC0894w.LESS_THAN_EQUALS);
                arrayList2.add(EnumC0894w.NOT_EQUALS);
                b(c0874s2);
                C0874s c0874s3 = new C0874s(2);
                EnumC0894w enumC0894w3 = EnumC0894w.APPLY;
                ArrayList arrayList3 = c0874s3.f14392a;
                arrayList3.add(enumC0894w3);
                arrayList3.add(EnumC0894w.BLOCK);
                arrayList3.add(EnumC0894w.BREAK);
                arrayList3.add(EnumC0894w.CASE);
                arrayList3.add(EnumC0894w.DEFAULT);
                arrayList3.add(EnumC0894w.CONTINUE);
                arrayList3.add(EnumC0894w.DEFINE_FUNCTION);
                arrayList3.add(EnumC0894w.FN);
                arrayList3.add(EnumC0894w.IF);
                arrayList3.add(EnumC0894w.QUOTE);
                arrayList3.add(EnumC0894w.RETURN);
                arrayList3.add(EnumC0894w.SWITCH);
                arrayList3.add(EnumC0894w.TERNARY);
                b(c0874s3);
                C0874s c0874s4 = new C0874s(3);
                EnumC0894w enumC0894w4 = EnumC0894w.AND;
                ArrayList arrayList4 = c0874s4.f14392a;
                arrayList4.add(enumC0894w4);
                arrayList4.add(EnumC0894w.NOT);
                arrayList4.add(EnumC0894w.OR);
                b(c0874s4);
                C0874s c0874s5 = new C0874s(4);
                EnumC0894w enumC0894w5 = EnumC0894w.FOR_IN;
                ArrayList arrayList5 = c0874s5.f14392a;
                arrayList5.add(enumC0894w5);
                arrayList5.add(EnumC0894w.FOR_IN_CONST);
                arrayList5.add(EnumC0894w.FOR_IN_LET);
                arrayList5.add(EnumC0894w.FOR_LET);
                arrayList5.add(EnumC0894w.FOR_OF);
                arrayList5.add(EnumC0894w.FOR_OF_CONST);
                arrayList5.add(EnumC0894w.FOR_OF_LET);
                arrayList5.add(EnumC0894w.WHILE);
                b(c0874s5);
                C0874s c0874s6 = new C0874s(5);
                EnumC0894w enumC0894w6 = EnumC0894w.ADD;
                ArrayList arrayList6 = c0874s6.f14392a;
                arrayList6.add(enumC0894w6);
                arrayList6.add(EnumC0894w.DIVIDE);
                arrayList6.add(EnumC0894w.MODULUS);
                arrayList6.add(EnumC0894w.MULTIPLY);
                arrayList6.add(EnumC0894w.NEGATE);
                arrayList6.add(EnumC0894w.POST_DECREMENT);
                arrayList6.add(EnumC0894w.POST_INCREMENT);
                arrayList6.add(EnumC0894w.PRE_DECREMENT);
                arrayList6.add(EnumC0894w.PRE_INCREMENT);
                arrayList6.add(EnumC0894w.SUBTRACT);
                b(c0874s6);
                C0874s c0874s7 = new C0874s(7);
                EnumC0894w enumC0894w7 = EnumC0894w.ASSIGN;
                ArrayList arrayList7 = c0874s7.f14392a;
                arrayList7.add(enumC0894w7);
                arrayList7.add(EnumC0894w.CONST);
                arrayList7.add(EnumC0894w.CREATE_ARRAY);
                arrayList7.add(EnumC0894w.CREATE_OBJECT);
                arrayList7.add(EnumC0894w.EXPRESSION_LIST);
                arrayList7.add(EnumC0894w.GET);
                arrayList7.add(EnumC0894w.GET_INDEX);
                arrayList7.add(EnumC0894w.GET_PROPERTY);
                arrayList7.add(EnumC0894w.NULL);
                arrayList7.add(EnumC0894w.SET_PROPERTY);
                arrayList7.add(EnumC0894w.TYPEOF);
                arrayList7.add(EnumC0894w.UNDEFINED);
                arrayList7.add(EnumC0894w.VAR);
                b(c0874s7);
                break;
        }
    }
}
