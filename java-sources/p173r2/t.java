package p173r2;

import H9.h;
import H9.k;
import H9.m;
import H9.v;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p110k9.a;
import p110k9.o;
import p110k9.y;
import p120l9.n;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m f21470m = new m("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m f21471n = new m("\\{(.+?)\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m f21472o = new m("http[s]?://");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m f21473p = new m(".*");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m f21474q = new m("([^/]*?|)");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f21475r = new m("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f21479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f21480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f21481f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f21482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f21483i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f21484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f21485l;

    public t(String str) {
        this.f21476a = str;
        ArrayList arrayList = new ArrayList();
        this.f21477b = arrayList;
        final int i10 = 0;
        this.f21479d = a.d(new p241y9.a(this) { // from class: r2.q

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ t f21465s;

            {
                this.f21465s = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                List list;
                switch (i10) {
                    case 0:
                        String str2 = this.f21465s.f21478c;
                        if (str2 != null) {
                            return new m(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f21465s.f21476a;
                        m mVar = t.f21475r;
                        mVar.getClass();
                        return Boolean.valueOf(mVar.f3641r.matcher(str3).matches());
                    case 2:
                        t tVar = this.f21465s;
                        String str4 = tVar.f21476a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f21480e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            j.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i11 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(c.t("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) p120l9.m.g0(queryParameters);
                                if (str6 == null) {
                                    tVar.g = true;
                                    str6 = str5;
                                }
                                m mVar2 = t.f21471n;
                                mVar2.getClass();
                                j.e(str6, "input");
                                Matcher matcher = mVar2.f3641r.matcher(str6);
                                j.d(matcher, "matcher(...)");
                                int i12 = 0;
                                k kVarE = p000a.a.e(matcher, 0, str6);
                                s sVar = new s();
                                while (kVarE != null) {
                                    h hVarC = kVarE.f3638c.c(i11);
                                    j.b(hVarC);
                                    int i13 = i11;
                                    sVar.f21469b.add(hVarC.f3630a);
                                    if (kVarE.a().f1995r > i12) {
                                        String strSubstring = str6.substring(i12, kVarE.a().f1995r);
                                        j.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        j.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i12 = kVarE.a().f1996s + 1;
                                    kVarE = kVarE.b();
                                    i11 = i13;
                                }
                                if (i12 < str6.length()) {
                                    String strSubstring2 = str6.substring(i12);
                                    j.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    j.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                j.d(string, "toString(...)");
                                sVar.f21468a = t.h(string);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f21465s.f21476a;
                        Uri uri2 = Uri.parse(str7);
                        j.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        j.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        j.b(fragment);
                        t.a(fragment, arrayList2, sb2);
                        return new p110k9.j(arrayList2, sb2.toString());
                    case 4:
                        p110k9.j jVar = (p110k9.j) this.f21465s.f21482h.getValue();
                        return (jVar == null || (list = (List) jVar.f19077r) == null) ? new ArrayList() : list;
                    case 5:
                        p110k9.j jVar2 = (p110k9.j) this.f21465s.f21482h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f19078s;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f21465s.j.getValue();
                        if (str8 != null) {
                            return new m(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i11 = 1;
        this.f21480e = a.d(new p241y9.a(this) { // from class: r2.q

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ t f21465s;

            {
                this.f21465s = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                List list;
                switch (i11) {
                    case 0:
                        String str2 = this.f21465s.f21478c;
                        if (str2 != null) {
                            return new m(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f21465s.f21476a;
                        m mVar = t.f21475r;
                        mVar.getClass();
                        return Boolean.valueOf(mVar.f3641r.matcher(str3).matches());
                    case 2:
                        t tVar = this.f21465s;
                        String str4 = tVar.f21476a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f21480e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            j.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i12 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(c.t("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) p120l9.m.g0(queryParameters);
                                if (str6 == null) {
                                    tVar.g = true;
                                    str6 = str5;
                                }
                                m mVar2 = t.f21471n;
                                mVar2.getClass();
                                j.e(str6, "input");
                                Matcher matcher = mVar2.f3641r.matcher(str6);
                                j.d(matcher, "matcher(...)");
                                int i13 = 0;
                                k kVarE = p000a.a.e(matcher, 0, str6);
                                s sVar = new s();
                                while (kVarE != null) {
                                    h hVarC = kVarE.f3638c.c(i12);
                                    j.b(hVarC);
                                    int i14 = i12;
                                    sVar.f21469b.add(hVarC.f3630a);
                                    if (kVarE.a().f1995r > i13) {
                                        String strSubstring = str6.substring(i13, kVarE.a().f1995r);
                                        j.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        j.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i13 = kVarE.a().f1996s + 1;
                                    kVarE = kVarE.b();
                                    i12 = i14;
                                }
                                if (i13 < str6.length()) {
                                    String strSubstring2 = str6.substring(i13);
                                    j.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    j.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                j.d(string, "toString(...)");
                                sVar.f21468a = t.h(string);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f21465s.f21476a;
                        Uri uri2 = Uri.parse(str7);
                        j.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        j.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        j.b(fragment);
                        t.a(fragment, arrayList2, sb2);
                        return new p110k9.j(arrayList2, sb2.toString());
                    case 4:
                        p110k9.j jVar = (p110k9.j) this.f21465s.f21482h.getValue();
                        return (jVar == null || (list = (List) jVar.f19077r) == null) ? new ArrayList() : list;
                    case 5:
                        p110k9.j jVar2 = (p110k9.j) this.f21465s.f21482h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f19078s;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f21465s.j.getValue();
                        if (str8 != null) {
                            return new m(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i12 = 2;
        p241y9.a aVar = new p241y9.a(this) { // from class: r2.q

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ t f21465s;

            {
                this.f21465s = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                List list;
                switch (i12) {
                    case 0:
                        String str2 = this.f21465s.f21478c;
                        if (str2 != null) {
                            return new m(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f21465s.f21476a;
                        m mVar = t.f21475r;
                        mVar.getClass();
                        return Boolean.valueOf(mVar.f3641r.matcher(str3).matches());
                    case 2:
                        t tVar = this.f21465s;
                        String str4 = tVar.f21476a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f21480e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            j.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i13 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(c.t("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) p120l9.m.g0(queryParameters);
                                if (str6 == null) {
                                    tVar.g = true;
                                    str6 = str5;
                                }
                                m mVar2 = t.f21471n;
                                mVar2.getClass();
                                j.e(str6, "input");
                                Matcher matcher = mVar2.f3641r.matcher(str6);
                                j.d(matcher, "matcher(...)");
                                int i14 = 0;
                                k kVarE = p000a.a.e(matcher, 0, str6);
                                s sVar = new s();
                                while (kVarE != null) {
                                    h hVarC = kVarE.f3638c.c(i13);
                                    j.b(hVarC);
                                    int i15 = i13;
                                    sVar.f21469b.add(hVarC.f3630a);
                                    if (kVarE.a().f1995r > i14) {
                                        String strSubstring = str6.substring(i14, kVarE.a().f1995r);
                                        j.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        j.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i14 = kVarE.a().f1996s + 1;
                                    kVarE = kVarE.b();
                                    i13 = i15;
                                }
                                if (i14 < str6.length()) {
                                    String strSubstring2 = str6.substring(i14);
                                    j.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    j.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                j.d(string, "toString(...)");
                                sVar.f21468a = t.h(string);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f21465s.f21476a;
                        Uri uri2 = Uri.parse(str7);
                        j.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        j.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        j.b(fragment);
                        t.a(fragment, arrayList2, sb2);
                        return new p110k9.j(arrayList2, sb2.toString());
                    case 4:
                        p110k9.j jVar = (p110k9.j) this.f21465s.f21482h.getValue();
                        return (jVar == null || (list = (List) jVar.f19077r) == null) ? new ArrayList() : list;
                    case 5:
                        p110k9.j jVar2 = (p110k9.j) this.f21465s.f21482h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f19078s;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f21465s.j.getValue();
                        if (str8 != null) {
                            return new m(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        p110k9.h hVar = p110k9.h.f19075s;
        this.f21481f = a.c(hVar, aVar);
        final int i13 = 3;
        this.f21482h = a.c(hVar, new p241y9.a(this) { // from class: r2.q

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ t f21465s;

            {
                this.f21465s = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                List list;
                switch (i13) {
                    case 0:
                        String str2 = this.f21465s.f21478c;
                        if (str2 != null) {
                            return new m(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f21465s.f21476a;
                        m mVar = t.f21475r;
                        mVar.getClass();
                        return Boolean.valueOf(mVar.f3641r.matcher(str3).matches());
                    case 2:
                        t tVar = this.f21465s;
                        String str4 = tVar.f21476a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f21480e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            j.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i14 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(c.t("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) p120l9.m.g0(queryParameters);
                                if (str6 == null) {
                                    tVar.g = true;
                                    str6 = str5;
                                }
                                m mVar2 = t.f21471n;
                                mVar2.getClass();
                                j.e(str6, "input");
                                Matcher matcher = mVar2.f3641r.matcher(str6);
                                j.d(matcher, "matcher(...)");
                                int i15 = 0;
                                k kVarE = p000a.a.e(matcher, 0, str6);
                                s sVar = new s();
                                while (kVarE != null) {
                                    h hVarC = kVarE.f3638c.c(i14);
                                    j.b(hVarC);
                                    int i16 = i14;
                                    sVar.f21469b.add(hVarC.f3630a);
                                    if (kVarE.a().f1995r > i15) {
                                        String strSubstring = str6.substring(i15, kVarE.a().f1995r);
                                        j.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        j.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i15 = kVarE.a().f1996s + 1;
                                    kVarE = kVarE.b();
                                    i14 = i16;
                                }
                                if (i15 < str6.length()) {
                                    String strSubstring2 = str6.substring(i15);
                                    j.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    j.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                j.d(string, "toString(...)");
                                sVar.f21468a = t.h(string);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f21465s.f21476a;
                        Uri uri2 = Uri.parse(str7);
                        j.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        j.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        j.b(fragment);
                        t.a(fragment, arrayList2, sb2);
                        return new p110k9.j(arrayList2, sb2.toString());
                    case 4:
                        p110k9.j jVar = (p110k9.j) this.f21465s.f21482h.getValue();
                        return (jVar == null || (list = (List) jVar.f19077r) == null) ? new ArrayList() : list;
                    case 5:
                        p110k9.j jVar2 = (p110k9.j) this.f21465s.f21482h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f19078s;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f21465s.j.getValue();
                        if (str8 != null) {
                            return new m(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i14 = 4;
        this.f21483i = a.c(hVar, new p241y9.a(this) { // from class: r2.q

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ t f21465s;

            {
                this.f21465s = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                List list;
                switch (i14) {
                    case 0:
                        String str2 = this.f21465s.f21478c;
                        if (str2 != null) {
                            return new m(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f21465s.f21476a;
                        m mVar = t.f21475r;
                        mVar.getClass();
                        return Boolean.valueOf(mVar.f3641r.matcher(str3).matches());
                    case 2:
                        t tVar = this.f21465s;
                        String str4 = tVar.f21476a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f21480e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            j.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i15 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(c.t("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) p120l9.m.g0(queryParameters);
                                if (str6 == null) {
                                    tVar.g = true;
                                    str6 = str5;
                                }
                                m mVar2 = t.f21471n;
                                mVar2.getClass();
                                j.e(str6, "input");
                                Matcher matcher = mVar2.f3641r.matcher(str6);
                                j.d(matcher, "matcher(...)");
                                int i16 = 0;
                                k kVarE = p000a.a.e(matcher, 0, str6);
                                s sVar = new s();
                                while (kVarE != null) {
                                    h hVarC = kVarE.f3638c.c(i15);
                                    j.b(hVarC);
                                    int i17 = i15;
                                    sVar.f21469b.add(hVarC.f3630a);
                                    if (kVarE.a().f1995r > i16) {
                                        String strSubstring = str6.substring(i16, kVarE.a().f1995r);
                                        j.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        j.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i16 = kVarE.a().f1996s + 1;
                                    kVarE = kVarE.b();
                                    i15 = i17;
                                }
                                if (i16 < str6.length()) {
                                    String strSubstring2 = str6.substring(i16);
                                    j.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    j.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                j.d(string, "toString(...)");
                                sVar.f21468a = t.h(string);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f21465s.f21476a;
                        Uri uri2 = Uri.parse(str7);
                        j.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        j.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        j.b(fragment);
                        t.a(fragment, arrayList2, sb2);
                        return new p110k9.j(arrayList2, sb2.toString());
                    case 4:
                        p110k9.j jVar = (p110k9.j) this.f21465s.f21482h.getValue();
                        return (jVar == null || (list = (List) jVar.f19077r) == null) ? new ArrayList() : list;
                    case 5:
                        p110k9.j jVar2 = (p110k9.j) this.f21465s.f21482h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f19078s;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f21465s.j.getValue();
                        if (str8 != null) {
                            return new m(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i15 = 5;
        this.j = a.c(hVar, new p241y9.a(this) { // from class: r2.q

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ t f21465s;

            {
                this.f21465s = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                List list;
                switch (i15) {
                    case 0:
                        String str2 = this.f21465s.f21478c;
                        if (str2 != null) {
                            return new m(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f21465s.f21476a;
                        m mVar = t.f21475r;
                        mVar.getClass();
                        return Boolean.valueOf(mVar.f3641r.matcher(str3).matches());
                    case 2:
                        t tVar = this.f21465s;
                        String str4 = tVar.f21476a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f21480e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            j.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i16 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(c.t("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) p120l9.m.g0(queryParameters);
                                if (str6 == null) {
                                    tVar.g = true;
                                    str6 = str5;
                                }
                                m mVar2 = t.f21471n;
                                mVar2.getClass();
                                j.e(str6, "input");
                                Matcher matcher = mVar2.f3641r.matcher(str6);
                                j.d(matcher, "matcher(...)");
                                int i17 = 0;
                                k kVarE = p000a.a.e(matcher, 0, str6);
                                s sVar = new s();
                                while (kVarE != null) {
                                    h hVarC = kVarE.f3638c.c(i16);
                                    j.b(hVarC);
                                    int i18 = i16;
                                    sVar.f21469b.add(hVarC.f3630a);
                                    if (kVarE.a().f1995r > i17) {
                                        String strSubstring = str6.substring(i17, kVarE.a().f1995r);
                                        j.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        j.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i17 = kVarE.a().f1996s + 1;
                                    kVarE = kVarE.b();
                                    i16 = i18;
                                }
                                if (i17 < str6.length()) {
                                    String strSubstring2 = str6.substring(i17);
                                    j.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    j.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                j.d(string, "toString(...)");
                                sVar.f21468a = t.h(string);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f21465s.f21476a;
                        Uri uri2 = Uri.parse(str7);
                        j.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        j.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        j.b(fragment);
                        t.a(fragment, arrayList2, sb2);
                        return new p110k9.j(arrayList2, sb2.toString());
                    case 4:
                        p110k9.j jVar = (p110k9.j) this.f21465s.f21482h.getValue();
                        return (jVar == null || (list = (List) jVar.f19077r) == null) ? new ArrayList() : list;
                    case 5:
                        p110k9.j jVar2 = (p110k9.j) this.f21465s.f21482h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f19078s;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f21465s.j.getValue();
                        if (str8 != null) {
                            return new m(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i16 = 6;
        this.f21484k = a.d(new p241y9.a(this) { // from class: r2.q

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ t f21465s;

            {
                this.f21465s = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                List list;
                switch (i16) {
                    case 0:
                        String str2 = this.f21465s.f21478c;
                        if (str2 != null) {
                            return new m(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f21465s.f21476a;
                        m mVar = t.f21475r;
                        mVar.getClass();
                        return Boolean.valueOf(mVar.f3641r.matcher(str3).matches());
                    case 2:
                        t tVar = this.f21465s;
                        String str4 = tVar.f21476a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f21480e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            j.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i17 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(c.t("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) p120l9.m.g0(queryParameters);
                                if (str6 == null) {
                                    tVar.g = true;
                                    str6 = str5;
                                }
                                m mVar2 = t.f21471n;
                                mVar2.getClass();
                                j.e(str6, "input");
                                Matcher matcher = mVar2.f3641r.matcher(str6);
                                j.d(matcher, "matcher(...)");
                                int i18 = 0;
                                k kVarE = p000a.a.e(matcher, 0, str6);
                                s sVar = new s();
                                while (kVarE != null) {
                                    h hVarC = kVarE.f3638c.c(i17);
                                    j.b(hVarC);
                                    int i19 = i17;
                                    sVar.f21469b.add(hVarC.f3630a);
                                    if (kVarE.a().f1995r > i18) {
                                        String strSubstring = str6.substring(i18, kVarE.a().f1995r);
                                        j.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        j.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i18 = kVarE.a().f1996s + 1;
                                    kVarE = kVarE.b();
                                    i17 = i19;
                                }
                                if (i18 < str6.length()) {
                                    String strSubstring2 = str6.substring(i18);
                                    j.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    j.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                j.d(string, "toString(...)");
                                sVar.f21468a = t.h(string);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f21465s.f21476a;
                        Uri uri2 = Uri.parse(str7);
                        j.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        j.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        j.b(fragment);
                        t.a(fragment, arrayList2, sb2);
                        return new p110k9.j(arrayList2, sb2.toString());
                    case 4:
                        p110k9.j jVar = (p110k9.j) this.f21465s.f21482h.getValue();
                        return (jVar == null || (list = (List) jVar.f19077r) == null) ? new ArrayList() : list;
                    case 5:
                        p110k9.j jVar2 = (p110k9.j) this.f21465s.f21482h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f19078s;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f21465s.j.getValue();
                        if (str8 != null) {
                            return new m(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i17 = 7;
        a.d(new p241y9.a(this) { // from class: r2.q

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ t f21465s;

            {
                this.f21465s = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, k9.g] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                List list;
                switch (i17) {
                    case 0:
                        String str2 = this.f21465s.f21478c;
                        if (str2 != null) {
                            return new m(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f21465s.f21476a;
                        m mVar = t.f21475r;
                        mVar.getClass();
                        return Boolean.valueOf(mVar.f3641r.matcher(str3).matches());
                    case 2:
                        t tVar = this.f21465s;
                        String str4 = tVar.f21476a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f21480e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str4);
                            j.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i18 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(c.t("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) p120l9.m.g0(queryParameters);
                                if (str6 == null) {
                                    tVar.g = true;
                                    str6 = str5;
                                }
                                m mVar2 = t.f21471n;
                                mVar2.getClass();
                                j.e(str6, "input");
                                Matcher matcher = mVar2.f3641r.matcher(str6);
                                j.d(matcher, "matcher(...)");
                                int i19 = 0;
                                k kVarE = p000a.a.e(matcher, 0, str6);
                                s sVar = new s();
                                while (kVarE != null) {
                                    h hVarC = kVarE.f3638c.c(i18);
                                    j.b(hVarC);
                                    int i110 = i18;
                                    sVar.f21469b.add(hVarC.f3630a);
                                    if (kVarE.a().f1995r > i19) {
                                        String strSubstring = str6.substring(i19, kVarE.a().f1995r);
                                        j.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        j.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i19 = kVarE.a().f1996s + 1;
                                    kVarE = kVarE.b();
                                    i18 = i110;
                                }
                                if (i19 < str6.length()) {
                                    String strSubstring2 = str6.substring(i19);
                                    j.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    j.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                j.d(string, "toString(...)");
                                sVar.f21468a = t.h(string);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f21465s.f21476a;
                        Uri uri2 = Uri.parse(str7);
                        j.d(uri2, "parse(...)");
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str7);
                        j.d(uri3, "parse(...)");
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        j.b(fragment);
                        t.a(fragment, arrayList2, sb2);
                        return new p110k9.j(arrayList2, sb2.toString());
                    case 4:
                        p110k9.j jVar = (p110k9.j) this.f21465s.f21482h.getValue();
                        return (jVar == null || (list = (List) jVar.f19077r) == null) ? new ArrayList() : list;
                    case 5:
                        p110k9.j jVar2 = (p110k9.j) this.f21465s.f21482h.getValue();
                        if (jVar2 != null) {
                            return (String) jVar2.f19078s;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f21465s.j.getValue();
                        if (str8 != null) {
                            return new m(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!f21470m.f3641r.matcher(str).find()) {
            String strPattern = f21472o.f3641r.pattern();
            j.d(strPattern, "pattern(...)");
            sb.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        j.d(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        j.d(matcher, "matcher(...)");
        boolean z10 = false;
        k kVarE = p000a.a.e(matcher, 0, str);
        if (kVarE != null) {
            String strSubstring = str.substring(0, kVarE.a().f1995r);
            j.d(strSubstring, "substring(...)");
            a(strSubstring, arrayList, sb);
            if (!f21473p.f3641r.matcher(sb).find() && !f21474q.f3641r.matcher(sb).find()) {
                z10 = true;
            }
            this.f21485l = z10;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb.toString();
        j.d(string, "toString(...)");
        this.f21478c = h(string);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        m mVar = f21471n;
        mVar.getClass();
        Matcher matcher = mVar.f3641r.matcher(str);
        j.d(matcher, "matcher(...)");
        int i10 = 0;
        for (k kVarE = p000a.a.e(matcher, 0, str); kVarE != null; kVarE = kVarE.b()) {
            h hVarC = kVarE.f3638c.c(1);
            j.b(hVarC);
            arrayList.add(hVarC.f3630a);
            if (kVarE.a().f1995r > i10) {
                String strSubstring = str.substring(i10, kVarE.a().f1995r);
                j.d(strSubstring, "substring(...)");
                String strQuote = Pattern.quote(strSubstring);
                j.d(strQuote, "quote(...)");
                sb.append(strQuote);
            }
            String strPattern = f21474q.f3641r.pattern();
            j.d(strPattern, "pattern(...)");
            sb.append(strPattern);
            i10 = kVarE.a().f1996s + 1;
        }
        if (i10 < str.length()) {
            String strSubstring2 = str.substring(i10);
            j.d(strSubstring2, "substring(...)");
            String strQuote2 = Pattern.quote(strSubstring2);
            j.d(strQuote2, "quote(...)");
            sb.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, C1288h c1288h) {
        if (c1288h == null) {
            Y2.a.c0(str, str2, bundle);
            return;
        }
        E e10 = c1288h.f21439a;
        j.e(str, "key");
        e10.e(bundle, str, e10.d(str2));
    }

    public static String h(String str) {
        if (H9.o.V0(str, "\\Q") && H9.o.V0(str, "\\E")) {
            return v.P0(str, ".*", "\\E.*\\Q");
        }
        return H9.o.V0(str, "\\.\\*") ? v.P0(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.f21476a);
        j.d(uri2, "parse(...)");
        List<String> pathSegments2 = uri2.getPathSegments();
        j.e(pathSegments, "<this>");
        j.e(pathSegments2, "other");
        Set setF0 = p120l9.m.F0(pathSegments);
        setF0.retainAll(pathSegments2);
        return setF0.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k9.g] */
    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f21481f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            p120l9.m.d0(arrayList, ((s) it.next()).f21469b);
        }
        return p120l9.m.q0(p120l9.m.q0(this.f21477b, arrayList), (List) this.f21483i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, k9.g] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        k kVarC;
        k kVarC2;
        String strDecode;
        j.e(uri, "deepLink");
        j.e(linkedHashMap, "arguments");
        m mVar = (m) this.f21479d.getValue();
        if (mVar != null && (kVarC = mVar.c(uri.toString())) != null) {
            int i10 = 0;
            Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
            if (e(kVarC, bundleP, linkedHashMap) && (!((Boolean) this.f21480e.getValue()).booleanValue() || f(uri, bundleP, linkedHashMap))) {
                String fragment = uri.getFragment();
                m mVar2 = (m) this.f21484k.getValue();
                if (mVar2 != null && (kVarC2 = mVar2.c(String.valueOf(fragment))) != null) {
                    List list = (List) this.f21483i.getValue();
                    ArrayList arrayList = new ArrayList(n.a0(list, 10));
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC0813f2.T();
                            throw null;
                        }
                        String str = (String) obj;
                        h hVarC = kVarC2.f3638c.c(i11);
                        if (hVarC != null) {
                            strDecode = Uri.decode(hVarC.f3630a);
                            j.d(strDecode, "decode(...)");
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleP, str, strDecode, (C1288h) linkedHashMap.get(str));
                            arrayList.add(y.f19095a);
                            i10 = i11;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (i.e(linkedHashMap, new r(0, bundleP)).isEmpty()) {
                    return bundleP;
                }
            }
        }
        return null;
    }

    public final boolean e(k kVar, Bundle bundle, Map map) {
        ArrayList arrayList = this.f21477b;
        ArrayList arrayList2 = new ArrayList(n.a0(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i12 = i10 + 1;
            String strDecode = null;
            if (i10 < 0) {
                AbstractC0813f2.T();
                throw null;
            }
            String str = (String) obj;
            h hVarC = kVar.f3638c.c(i12);
            if (hVarC != null) {
                strDecode = Uri.decode(hVarC.f3630a);
                j.d(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str, strDecode, (C1288h) map.get(str));
                arrayList2.add(y.f19095a);
                i10 = i12;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        return this.f21476a.equals(((t) obj).f21476a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k9.g] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        k kVar;
        ?? r14;
        Object objValueOf;
        boolean z10;
        Object obj;
        String query;
        t tVar = this;
        for (Map.Entry entry : ((Map) tVar.f21481f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            s sVar = (s) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (tVar.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = AbstractC0813f2.K(query);
            }
            y yVar = y.f19095a;
            boolean z11 = false;
            Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
            ArrayList arrayList = sVar.f21469b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                String str2 = (String) obj2;
                C1288h c1288h = (C1288h) map.get(str2);
                E e10 = c1288h != null ? c1288h.f21439a : null;
                if ((e10 instanceof C1283c) && !c1288h.f21440b) {
                    C1283c c1283c = (C1283c) e10;
                    switch (c1283c.f21436e) {
                        case 0:
                            obj = new boolean[0];
                            break;
                        case 1:
                            obj = new float[0];
                            break;
                        case 2:
                            obj = new int[0];
                            break;
                        case 3:
                            obj = new long[0];
                            break;
                        default:
                            obj = new String[0];
                            break;
                    }
                    c1283c.e(bundleP, str2, obj);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = sVar.f21468a;
                if (str4 != null) {
                    Pattern patternCompile = Pattern.compile(str4);
                    j.d(patternCompile, "compile(...)");
                    j.e(str3, "input");
                    Matcher matcher = patternCompile.matcher(str3);
                    j.d(matcher, "matcher(...)");
                    if (matcher.matches()) {
                        kVar = new k(matcher, str3);
                    } else {
                        kVar = null;
                    }
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    return z11;
                }
                ArrayList arrayList2 = sVar.f21469b;
                ArrayList arrayList3 = new ArrayList(n.a0(arrayList2, 10));
                int size2 = arrayList2.size();
                boolean z12 = z11;
                int i11 = z12 ? 1 : 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    int i12 = r14 + 1;
                    if (r14 < 0) {
                        r14 = z12;
                        AbstractC0813f2.T();
                        throw null;
                    }
                    String str5 = (String) obj3;
                    h hVarC = kVar.f3638c.c(i12);
                    String str6 = hVarC != null ? hVarC.f3630a : null;
                    if (str6 == null) {
                        r14 = z12;
                        r14 = z12;
                        str6 = "";
                    }
                    r14 = z12;
                    r14 = z12;
                    C1288h c1288h2 = (C1288h) map.get(str5);
                    try {
                        j.e(str5, "key");
                        if (bundleP.containsKey(str5)) {
                            if (bundleP.containsKey(str5)) {
                                if (c1288h2 != null) {
                                    E e11 = c1288h2.f21439a;
                                    Object objA = e11.a(str5, bundleP);
                                    if (!bundleP.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    e11.e(bundleP, str5, e11.c(objA, str6));
                                    objValueOf = yVar;
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            objValueOf = Boolean.valueOf(z10);
                        } else {
                            g(bundleP, str5, str6, c1288h2);
                            objValueOf = yVar;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    arrayList3.add(objValueOf);
                    map = map;
                    r14 = i12;
                    z11 = false;
                }
                r14 = z12;
                map = map;
            }
            bundle.putAll(bundleP);
            tVar = this;
        }
        return true;
    }

    public final int hashCode() {
        return this.f21476a.hashCode() * 961;
    }
}
