package p132n1;

import Da.r;
import Y2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.ayah.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import m1.e;
import org.xmlpull.v1.XmlPullParserException;
import s1.g;
import s1.h;
import s1.i;
import s1.j;
import s1.k;
import s1.l;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f19818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f19819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f19820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f19822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f19823f;
    public final SparseArray g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f19824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseIntArray f19825i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f19827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f19829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f19832q;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x012c A[Catch: IOException -> 0x006e, XmlPullParserException -> 0x0071, TryCatch #2 {IOException -> 0x006e, XmlPullParserException -> 0x0071, blocks: (B:3:0x0040, B:56:0x0144, B:10:0x004e, B:14:0x005d, B:16:0x0065, B:21:0x0074, B:23:0x007a, B:24:0x007f, B:27:0x0089, B:28:0x00b6, B:29:0x00c1, B:31:0x00c9, B:32:0x00d5, B:34:0x00dd, B:36:0x00e9, B:38:0x00ed, B:40:0x00f3, B:41:0x00f8, B:43:0x00fc, B:45:0x0101, B:47:0x0109, B:46:0x0104, B:48:0x010d, B:50:0x0115, B:51:0x0120, B:53:0x0128, B:54:0x012c, B:55:0x0141), top: B:62:0x0040 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x012c, please report this as an issue */
    public A(Context context, MotionLayout motionLayout, int i10) {
        z zVar = null;
        this.f19819b = null;
        this.f19820c = null;
        ArrayList arrayList = new ArrayList();
        this.f19821d = arrayList;
        this.f19822e = null;
        this.f19823f = new ArrayList();
        this.g = new SparseArray();
        this.f19824h = new HashMap();
        this.f19825i = new SparseIntArray();
        this.j = 400;
        this.f19826k = 0;
        this.f19828m = false;
        this.f19818a = motionLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name) {
                        case "ConstraintSet":
                            h(context, xml);
                            break;
                        case "KeyFrameSet":
                            zVar.f19973k.add(new C1223i(xml));
                            break;
                        case "Transition":
                            zVar = new z(this, context, xml);
                            arrayList.add(zVar);
                            if (this.f19820c == null && !zVar.f19966b) {
                                this.f19820c = zVar;
                                L l10 = zVar.f19974l;
                                if (l10 != null) {
                                    l10.b(this.f19830o);
                                }
                            }
                            if (zVar.f19966b) {
                                if (zVar.f19967c == -1) {
                                    this.f19822e = zVar;
                                } else {
                                    this.f19823f.add(zVar);
                                }
                                arrayList.remove(zVar);
                            }
                            break;
                        case "OnClick":
                            zVar.f19975m.add(new y(context, zVar, xml));
                            break;
                        case "OnSwipe":
                            if (zVar == null) {
                                Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i10) + ".xml:" + xml.getLineNumber() + ")");
                            }
                        case "MotionScene":
                            i(context, xml);
                            break;
                        case "StateSet":
                            this.f19819b = new r(context, xml);
                            break;
                        default:
                            Log.v("MotionScene", "WARNING UNKNOWN ATTRIBUTE " + name);
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        this.g.put(R.id.motion_base, new l());
        this.f19824h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    public final boolean a(MotionLayout motionLayout, int i10) {
        if (this.f19829n == null) {
            ArrayList arrayList = this.f19821d;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                z zVar = (z) obj;
                int i12 = zVar.f19976n;
                if (i12 != 0) {
                    int i13 = zVar.f19968d;
                    v vVar = v.f19945u;
                    v vVar2 = v.f19944t;
                    v vVar3 = v.f19943s;
                    if (i10 == i13 && (i12 == 4 || i12 == 2)) {
                        motionLayout.setState(vVar);
                        motionLayout.setTransition(zVar);
                        if (zVar.f19976n == 4) {
                            motionLayout.o(1.0f);
                            motionLayout.setState(vVar3);
                            motionLayout.setState(vVar2);
                            return true;
                        }
                        motionLayout.setProgress(1.0f);
                        motionLayout.p(true);
                        motionLayout.setState(vVar3);
                        motionLayout.setState(vVar2);
                        motionLayout.setState(vVar);
                        return true;
                    }
                    if (i10 == zVar.f19967c && (i12 == 3 || i12 == 1)) {
                        motionLayout.setState(vVar);
                        motionLayout.setTransition(zVar);
                        if (zVar.f19976n == 3) {
                            motionLayout.o(0.0f);
                            motionLayout.setState(vVar3);
                            motionLayout.setState(vVar2);
                            return true;
                        }
                        motionLayout.setProgress(0.0f);
                        motionLayout.p(true);
                        motionLayout.setState(vVar3);
                        motionLayout.setState(vVar2);
                        motionLayout.setState(vVar);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final l b(int i10) {
        int iQ;
        r rVar = this.f19819b;
        if (rVar != null && (iQ = rVar.q(i10)) != -1) {
            i10 = iQ;
        }
        SparseArray sparseArray = this.g;
        if (sparseArray.get(i10) != null) {
            return (l) sparseArray.get(i10);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + a.G(this.f19818a.getContext(), i10) + " In MotionScene");
        return (l) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final Interpolator d() {
        z zVar = this.f19820c;
        int i10 = zVar.f19969e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f19818a.getContext(), this.f19820c.g);
        }
        if (i10 == -1) {
            return new x(e.c(zVar.f19970f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new AnticipateInterpolator();
        }
        if (i10 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    public final void e(n nVar) {
        z zVar = this.f19820c;
        int i10 = 0;
        if (zVar != null) {
            ArrayList arrayList = zVar.f19973k;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((C1223i) obj).a(nVar);
            }
            return;
        }
        z zVar2 = this.f19822e;
        if (zVar2 != null) {
            ArrayList arrayList2 = zVar2.f19973k;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((C1223i) obj2).a(nVar);
            }
        }
    }

    public final float f() {
        L l10;
        z zVar = this.f19820c;
        if (zVar == null || (l10 = zVar.f19974l) == null) {
            return 0.0f;
        }
        return l10.f19865q;
    }

    public final int g() {
        z zVar = this.f19820c;
        if (zVar == null) {
            return -1;
        }
        return zVar.f19968d;
    }

    public final void h(Context context, XmlResourceParser xmlResourceParser) {
        l lVar = new l();
        lVar.f22022b = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iC = -1;
        int iC2 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                iC2 = c(context, attributeValue);
            } else if (attributeName.equals("id")) {
                iC = c(context, attributeValue);
                int iIndexOf = attributeValue.indexOf(47);
                if (iIndexOf >= 0) {
                    attributeValue = attributeValue.substring(iIndexOf + 1);
                }
                this.f19824h.put(attributeValue, Integer.valueOf(iC));
            }
        }
        if (iC != -1) {
            int i11 = this.f19818a.f12196d0;
            lVar.i(context, xmlResourceParser);
            if (iC2 != -1) {
                this.f19825i.put(iC, iC2);
            }
            this.g.put(iC, lVar);
        }
    }

    public final void i(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f22046l);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.j = typedArrayObtainStyledAttributes.getInt(index, this.j);
            } else if (index == 1) {
                this.f19826k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void j(int i10) {
        SparseIntArray sparseIntArray = this.f19825i;
        int i11 = sparseIntArray.get(i10);
        if (i11 > 0) {
            j(sparseIntArray.get(i10));
            SparseArray sparseArray = this.g;
            l lVar = (l) sparseArray.get(i10);
            l lVar2 = (l) sparseArray.get(i11);
            if (lVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + a.G(this.f19818a.getContext(), i11));
                return;
            }
            HashMap map = lVar2.f22023c;
            HashMap map2 = lVar.f22023c;
            for (Integer num : map.keySet()) {
                num.getClass();
                g gVar = (g) map.get(num);
                if (!map2.containsKey(num)) {
                    map2.put(num, new g());
                }
                g gVar2 = (g) map2.get(num);
                h hVar = gVar2.f21936d;
                if (!hVar.f21963b) {
                    hVar.a(gVar.f21936d);
                }
                j jVar = gVar2.f21934b;
                if (!jVar.f22002a) {
                    j jVar2 = gVar.f21934b;
                    jVar.f22002a = jVar2.f22002a;
                    jVar.f22003b = jVar2.f22003b;
                    jVar.f22005d = jVar2.f22005d;
                    jVar.f22006e = jVar2.f22006e;
                    jVar.f22004c = jVar2.f22004c;
                }
                k kVar = gVar2.f21937e;
                if (!kVar.f22008a) {
                    kVar.a(gVar.f21937e);
                }
                i iVar = gVar2.f21935c;
                if (!iVar.f21996a) {
                    iVar.a(gVar.f21935c);
                }
                for (String str : gVar.f21938f.keySet()) {
                    if (!gVar2.f21938f.containsKey(str)) {
                        gVar2.f21938f.put(str, gVar.f21938f.get(str));
                    }
                }
            }
            sparseIntArray.put(i10, -1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public final void k(int i10, int i11) {
        int iQ;
        int iQ2;
        ArrayList arrayList;
        int size;
        int i12;
        int i13;
        ArrayList arrayList2;
        int size2;
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        int i14;
        L l10;
        r rVar = this.f19819b;
        if (rVar != null) {
            iQ = rVar.q(i10);
            if (iQ == -1) {
                iQ = i10;
            }
            iQ2 = this.f19819b.q(i11);
            if (iQ2 == -1) {
            }
            arrayList = this.f19821d;
            size = arrayList.size();
            i12 = 0;
            i13 = 0;
            while (true) {
                if (i13 < size) {
                    arrayList2 = this.f19823f;
                    size2 = arrayList2.size();
                    zVar = this.f19822e;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        zVar3 = (z) obj;
                        if (zVar3.f19967c == i11) {
                            zVar = zVar3;
                        }
                    }
                    zVar2 = new z(this, zVar);
                    zVar2.f19968d = iQ;
                    zVar2.f19967c = iQ2;
                    if (iQ != -1) {
                        arrayList.add(zVar2);
                    }
                    this.f19820c = zVar2;
                    return;
                }
                Object obj2 = arrayList.get(i13);
                i13++;
                zVar4 = (z) obj2;
                i14 = zVar4.f19967c;
                if ((i14 != iQ2 && zVar4.f19968d == iQ) || (i14 == i11 && zVar4.f19968d == i10)) {
                    break;
                }
            }
            this.f19820c = zVar4;
            l10 = zVar4.f19974l;
            if (l10 != null) {
                l10.b(this.f19830o);
            }
        }
        iQ = i10;
        iQ2 = i11;
        arrayList = this.f19821d;
        size = arrayList.size();
        i12 = 0;
        i13 = 0;
        while (true) {
            if (i13 < size) {
                arrayList2 = this.f19823f;
                size2 = arrayList2.size();
                zVar = this.f19822e;
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    zVar3 = (z) obj3;
                    if (zVar3.f19967c == i11) {
                        zVar = zVar3;
                    }
                }
                zVar2 = new z(this, zVar);
                zVar2.f19968d = iQ;
                zVar2.f19967c = iQ2;
                if (iQ != -1) {
                    arrayList.add(zVar2);
                }
                this.f19820c = zVar2;
                return;
            }
            Object obj4 = arrayList.get(i13);
            i13++;
            zVar4 = (z) obj4;
            i14 = zVar4.f19967c;
            if (i14 != iQ2) {
            }
        }
        this.f19820c = zVar4;
        l10 = zVar4.f19974l;
        if (l10 != null) {
            l10.b(this.f19830o);
        }
    }

    public final boolean l() {
        ArrayList arrayList = this.f19821d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((z) obj).f19974l != null) {
                return true;
            }
        }
        z zVar = this.f19820c;
        return (zVar == null || zVar.f19974l == null) ? false : true;
    }
}
