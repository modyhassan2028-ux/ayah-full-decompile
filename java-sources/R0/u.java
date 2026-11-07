package R0;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ F9.f[] f7181a;

    static {
        p251z9.l lVar = new p251z9.l("stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;");
        w.f24887a.getClass();
        f7181a = new F9.f[]{lVar, new p251z9.l("progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"), new p251z9.l("paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new p251z9.l("liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new p251z9.l("focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new p251z9.l("isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new p251z9.l("isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new p251z9.l("contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;"), new p251z9.l("contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;"), new p251z9.l("traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"), new p251z9.l("horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new p251z9.l("verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new p251z9.l("role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new p251z9.l("testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new p251z9.l("textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new p251z9.l("isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new p251z9.l("inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new p251z9.l("editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new p251z9.l("textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"), new p251z9.l("imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new p251z9.l("selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new p251z9.l("collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"), new p251z9.l("collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"), new p251z9.l("toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"), new p251z9.l("isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new p251z9.l("maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new p251z9.l("customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;")};
        v vVar = s.f7156a;
        v vVar2 = i.f7084a;
    }

    public static final v a(String str) {
        v vVar = new v(str);
        vVar.f7184c = true;
        return vVar;
    }

    public static final v b(String str, p241y9.e eVar) {
        return new v(str, true, eVar);
    }

    public static void c(j jVar, p241y9.c cVar) {
        jVar.e(i.f7084a, new a(null, cVar));
    }

    public static final void d(j jVar, String str) {
        v vVar = s.f7156a;
        jVar.e(s.f7156a, AbstractC0813f2.K(str));
    }

    public static final void e(j jVar, int i10) {
        v vVar = s.f7176w;
        F9.f fVar = f7181a[12];
        vVar.a(jVar, new g(i10));
    }

    public static final void f(j jVar, boolean z10) {
        v vVar = s.f7149G;
        F9.f fVar = f7181a[20];
        vVar.a(jVar, Boolean.valueOf(z10));
    }

    public static final void g(j jVar) {
        v vVar = s.f7166m;
        F9.f fVar = f7181a[6];
        vVar.a(jVar, Boolean.TRUE);
    }
}
