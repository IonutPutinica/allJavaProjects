#pragma checksum "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "9410657f50b0325060e940a69c692bf28cb48463"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(Application.Pages.People.Pages_People_index), @"mvc.1.0.razor-page", @"/Pages/People/index.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.RazorPages.Infrastructure.RazorPageAttribute(@"/Pages/People/index.cshtml", typeof(Application.Pages.People.Pages_People_index), null)]
namespace Application.Pages.People
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#line 1 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\_ViewImports.cshtml"
using Application;

#line default
#line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"9410657f50b0325060e940a69c692bf28cb48463", @"/Pages/People/index.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"c90dca39a37f6f45ea220907f468a30a4a34bc9f", @"/Pages/_ViewImports.cshtml")]
    public class Pages_People_index : global::Microsoft.AspNetCore.Mvc.RazorPages.Page
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(26, 25, true);
            WriteLiteral("\r\n\r\n<h1> People </h1>\r\n\r\n");
            EndContext();
#line 7 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
 if(Model.HasPeople){



#line default
#line hidden
            BeginContext(78, 66, true);
            WriteLiteral("<table class=\"table\">\r\n    <thead>\r\n        <tr>\r\n            <th>");
            EndContext();
            BeginContext(145, 42, false);
#line 13 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
           Write(Html.DisplayNameFor(m => m.People[0].Name));

#line default
#line hidden
            EndContext();
            BeginContext(187, 23, true);
            WriteLiteral("</th>\r\n            <th>");
            EndContext();
            BeginContext(211, 41, false);
#line 14 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
           Write(Html.DisplayNameFor(m => m.People[0].CPR));

#line default
#line hidden
            EndContext();
            BeginContext(252, 23, true);
            WriteLiteral("</th>\r\n            <th>");
            EndContext();
            BeginContext(276, 50, false);
#line 15 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
           Write(Html.DisplayNameFor(m => m.People[0].MobileNumber));

#line default
#line hidden
            EndContext();
            BeginContext(326, 49, true);
            WriteLiteral("</th>\r\n        </tr>\r\n    </thead>\r\n    <tbody>\r\n");
            EndContext();
#line 19 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
         foreach(var person in Model.People){

#line default
#line hidden
            BeginContext(422, 38, true);
            WriteLiteral("            <tr>\r\n                <td>");
            EndContext();
            BeginContext(461, 33, false);
#line 21 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
               Write(Html.DisplayFor(m => person.Name));

#line default
#line hidden
            EndContext();
            BeginContext(494, 27, true);
            WriteLiteral("</td>\r\n                <td>");
            EndContext();
            BeginContext(522, 32, false);
#line 22 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
               Write(Html.DisplayFor(m => person.CPR));

#line default
#line hidden
            EndContext();
            BeginContext(554, 27, true);
            WriteLiteral("</td>\r\n                <td>");
            EndContext();
            BeginContext(582, 41, false);
#line 23 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
               Write(Html.DisplayFor(m => person.MobileNumber));

#line default
#line hidden
            EndContext();
            BeginContext(623, 26, true);
            WriteLiteral("</td>\r\n            </tr>\r\n");
            EndContext();
#line 25 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
        }

#line default
#line hidden
            BeginContext(660, 24, true);
            WriteLiteral("    </tbody>\r\n</table>\r\n");
            EndContext();
#line 28 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
}
else{

#line default
#line hidden
            BeginContext(694, 29, true);
            WriteLiteral("    <p>No people found.</p>\r\n");
            EndContext();
#line 31 "E:\Coding projects\Visual Studio projects\ProofOfConcept\Application\Pages\People\index.cshtml"
}

#line default
#line hidden
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<IndexModel> Html { get; private set; }
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.ViewDataDictionary<IndexModel> ViewData => (global::Microsoft.AspNetCore.Mvc.ViewFeatures.ViewDataDictionary<IndexModel>)PageContext?.ViewData;
        public IndexModel Model => ViewData.Model;
    }
}
#pragma warning restore 1591
