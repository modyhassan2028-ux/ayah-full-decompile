package A3;

import Ca.l;
import Ca.m;
import Ca.s;
import Ca.t;
import Ca.u;
import Ca.v;
import Ca.w;
import Da.k;
import F2.C0156a;
import T1.C0485b;
import T1.InterfaceC0488e;
import android.content.Context;
import com.ayah.common.data.source.preference.model.PreferencesBookmark;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.squareup.moshi.C;
import com.squareup.moshi.z;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import p110k9.i;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f490r;

    public /* synthetic */ d(int i10) {
        this.f490r = i10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f490r) {
            case 0:
                Q2.a aVar = (Q2.a) obj;
                j.e(aVar, "_connection");
                Q2.c cVarA0 = aVar.a0("SELECT * FROM favorites ORDER BY timestamp DESC");
                try {
                    int iD = Y2.a.D(cVarA0, "_id");
                    int iD2 = Y2.a.D(cVarA0, "ayah_id");
                    int iD3 = Y2.a.D(cVarA0, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (cVarA0.R()) {
                        arrayList.add(new E3.b((int) cVarA0.getLong(iD), (int) cVarA0.getLong(iD2), cVarA0.getLong(iD3)));
                    }
                    cVarA0.close();
                    return arrayList;
                } catch (Throwable th) {
                    cVarA0.close();
                    throw th;
                }
            case 1:
                Q2.a aVar2 = (Q2.a) obj;
                j.e(aVar2, "_connection");
                Q2.c cVarA1 = aVar2.a0("SELECT * FROM favorites ORDER BY timestamp DESC");
                try {
                    int iD4 = Y2.a.D(cVarA1, "_id");
                    int iD5 = Y2.a.D(cVarA1, "ayah_id");
                    int iD6 = Y2.a.D(cVarA1, "timestamp");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarA1.R()) {
                        arrayList2.add(new E3.b((int) cVarA1.getLong(iD4), (int) cVarA1.getLong(iD5), cVarA1.getLong(iD6)));
                    }
                    cVarA1.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    cVarA1.close();
                    throw th2;
                }
            case 2:
                Q2.a aVar3 = (Q2.a) obj;
                j.e(aVar3, "_connection");
                Q2.c cVarA2 = aVar3.a0("SELECT * FROM notes ORDER BY ayah_id ASC");
                try {
                    int iD7 = Y2.a.D(cVarA2, "_id");
                    int iD8 = Y2.a.D(cVarA2, "ayah_id");
                    int iD9 = Y2.a.D(cVarA2, "note");
                    int iD10 = Y2.a.D(cVarA2, "timestamp");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarA2.R()) {
                        arrayList3.add(new E3.c((int) cVarA2.getLong(iD7), (int) cVarA2.getLong(iD8), cVarA2.getLong(iD10), cVarA2.j(iD9)));
                    }
                    cVarA2.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    cVarA2.close();
                    throw th3;
                }
            case 3:
                Q2.a aVar4 = (Q2.a) obj;
                j.e(aVar4, "_connection");
                Q2.c cVarA3 = aVar4.a0("SELECT * FROM notes ORDER BY ayah_id ASC");
                try {
                    int iD11 = Y2.a.D(cVarA3, "_id");
                    int iD12 = Y2.a.D(cVarA3, "ayah_id");
                    int iD13 = Y2.a.D(cVarA3, "note");
                    int iD14 = Y2.a.D(cVarA3, "timestamp");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarA3.R()) {
                        arrayList4.add(new E3.c((int) cVarA3.getLong(iD11), (int) cVarA3.getLong(iD12), cVarA3.getLong(iD14), cVarA3.j(iD13)));
                    }
                    cVarA3.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    cVarA3.close();
                    throw th4;
                }
            case 4:
                w wVar = (w) obj;
                j.e(wVar, "it");
                return AbstractC0813f2.L(Long.valueOf(wVar.f868a), Long.valueOf(wVar.f869b));
            case 5:
                List list = (List) obj;
                j.e(list, "it");
                Object obj2 = list.get(0);
                j.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj2).longValue();
                Object obj3 = list.get(1);
                j.c(obj3, "null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
                Object obj4 = list.get(2);
                j.c(obj4, "null cannot be cast to non-null type okio.ByteString");
                return new t(jLongValue, (Ca.d) obj3, (k) obj4);
            case 6:
                List list2 = (List) obj;
                j.e(list2, "it");
                Object obj5 = list2.get(0);
                j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue2 = ((Long) obj5).longValue();
                Object obj6 = list2.get(1);
                j.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                return new w(jLongValue2, ((Long) obj6).longValue());
            case 7:
                if (j.a(obj, "1.2.840.113549.1.1.11")) {
                    return Ca.c.f795f;
                }
                if (j.a(obj, "1.2.840.113549.1.1.1")) {
                    return Ca.c.f795f;
                }
                if (j.a(obj, "1.2.840.10045.2.1")) {
                    return Ca.c.g;
                }
                return null;
            case 8:
                Ca.d dVar = (Ca.d) obj;
                j.e(dVar, "it");
                return AbstractC0813f2.L(dVar.f802a, dVar.f803b);
            case 9:
                List list3 = (List) obj;
                j.e(list3, "it");
                Object obj7 = list3.get(0);
                j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                return new Ca.d(list3.get(1), (String) obj7);
            case 10:
                Ca.g gVar = (Ca.g) obj;
                j.e(gVar, "it");
                return AbstractC0813f2.L(Boolean.valueOf(gVar.f811a), gVar.f812b);
            case 11:
                List list4 = (List) obj;
                j.e(list4, "it");
                Object obj8 = list4.get(0);
                j.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                return new Ca.g((Long) list4.get(1), ((Boolean) obj8).booleanValue());
            case 12:
                if (j.a(obj, "2.5.29.17")) {
                    return m.f831d;
                }
                if (j.a(obj, "2.5.29.19")) {
                    return m.f828a;
                }
                return null;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                s sVar = (s) obj;
                j.e(sVar, "it");
                return AbstractC0813f2.L(sVar.f852a, Boolean.valueOf(sVar.f853b), sVar.f854c);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                List list5 = (List) obj;
                j.e(list5, "it");
                Object obj9 = list5.get(0);
                j.c(obj9, "null cannot be cast to non-null type kotlin.String");
                Object obj10 = list5.get(1);
                j.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                return new s((String) obj9, ((Boolean) obj10).booleanValue(), list5.get(2));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                Ca.f fVar = (Ca.f) obj;
                j.e(fVar, "it");
                return AbstractC0813f2.L(fVar.f809a, fVar.f810b);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                List list6 = (List) obj;
                j.e(list6, "it");
                Object obj11 = list6.get(0);
                j.c(obj11, "null cannot be cast to non-null type kotlin.String");
                return new Ca.f(list6.get(1), (String) obj11);
            case 17:
                u uVar = (u) obj;
                j.e(uVar, "it");
                return AbstractC0813f2.L(uVar.f858a, uVar.f859b);
            case 18:
                List list7 = (List) obj;
                j.e(list7, "it");
                Object obj12 = list7.get(0);
                j.c(obj12, "null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
                Object obj13 = list7.get(1);
                j.c(obj13, "null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
                return new u((Ca.d) obj12, (Ca.k) obj13);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                v vVar = (v) obj;
                j.e(vVar, "it");
                Long lValueOf = Long.valueOf(vVar.f860a);
                BigInteger bigInteger = vVar.f861b;
                Ca.d dVar2 = vVar.f862c;
                Ca.j jVar = m.f832e;
                return AbstractC0813f2.L(lValueOf, bigInteger, dVar2, new p110k9.j(jVar, vVar.f863d), vVar.f864e, new p110k9.j(jVar, vVar.f865f), vVar.g, vVar.f866h, vVar.f867i, vVar.j);
            case 20:
                List list8 = (List) obj;
                j.e(list8, "it");
                Object obj14 = list8.get(0);
                j.c(obj14, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue3 = ((Long) obj14).longValue();
                Object obj15 = list8.get(1);
                j.c(obj15, "null cannot be cast to non-null type java.math.BigInteger");
                BigInteger bigInteger2 = (BigInteger) obj15;
                Object obj16 = list8.get(2);
                j.c(obj16, "null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
                Ca.d dVar3 = (Ca.d) obj16;
                Object obj17 = list8.get(3);
                j.c(obj17, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                Object obj18 = ((p110k9.j) obj17).f19078s;
                j.c(obj18, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
                List list9 = (List) obj18;
                Object obj19 = list8.get(4);
                j.c(obj19, "null cannot be cast to non-null type okhttp3.tls.internal.der.Validity");
                w wVar2 = (w) obj19;
                Object obj20 = list8.get(5);
                j.c(obj20, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                Object obj21 = ((p110k9.j) obj20).f19078s;
                j.c(obj21, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
                List list10 = (List) obj21;
                Object obj22 = list8.get(6);
                j.c(obj22, "null cannot be cast to non-null type okhttp3.tls.internal.der.SubjectPublicKeyInfo");
                u uVar2 = (u) obj22;
                Ca.k kVar = (Ca.k) list8.get(7);
                Ca.k kVar2 = (Ca.k) list8.get(8);
                Object obj23 = list8.get(9);
                j.c(obj23, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.tls.internal.der.Extension>");
                return new v(jLongValue3, bigInteger2, dVar3, list9, wVar2, list10, uVar2, kVar, kVar2, (List) obj23);
            case 21:
                l lVar = (l) obj;
                j.e(lVar, "it");
                return AbstractC0813f2.L(lVar.f825a, lVar.f826b, lVar.f827c);
            case 22:
                List list11 = (List) obj;
                j.e(list11, "it");
                Object obj24 = list11.get(0);
                j.c(obj24, "null cannot be cast to non-null type okhttp3.tls.internal.der.TbsCertificate");
                Object obj25 = list11.get(1);
                j.c(obj25, "null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
                Object obj26 = list11.get(2);
                j.c(obj26, "null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
                return new l((v) obj24, (Ca.d) obj25, (Ca.k) obj26);
            case 23:
                t tVar = (t) obj;
                j.e(tVar, "it");
                return AbstractC0813f2.L(Long.valueOf(tVar.f855a), tVar.f856b, tVar.f857c);
            case 24:
                j.e((C0156a) obj, "config");
                throw new i();
            case 25:
                Q2.c cVar = (Q2.c) obj;
                j.e(cVar, "it");
                return Boolean.valueOf(cVar.R());
            case 26:
                Q2.c cVar2 = (Q2.c) obj;
                j.e(cVar2, "statement");
                p129m9.g gVar2 = new p129m9.g();
                while (cVar2.R()) {
                    gVar2.add(Integer.valueOf((int) cVar2.getLong(0)));
                }
                return u0.f(gVar2);
            case 27:
                j.e((C0485b) obj, "it");
                return new X1.b(true);
            case 28:
                Context context = (Context) obj;
                j.e(context, "it");
                G3.a.f2790a.getClass();
                return p120l9.l.S(new InterfaceC0488e[]{new H3.a(G3.a.a(context), new C(new z(0)).a(PreferencesBookmark.class)), new H3.e(), new H3.b(G3.a.a(context))});
            default:
                j.e(obj, "it");
                C9.e.f785r.getClass();
                return Integer.valueOf(C9.e.f786s.a().nextInt(2147418112) + 65536);
        }
    }

    public /* synthetic */ d(F2.u uVar) {
        this.f490r = 24;
    }
}
