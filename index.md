---
layout: default
title: Introduction
nav_order: 1
description: "Just the Docs is a responsive Jekyll theme with built-in search that is easily customizable and hosted on GitHub Pages."
permalink: /
---

# Introduction
{: .no_toc }

---

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

---

## Is This Guide For You?

---

## Software Versions

---

## Prerequisites

---

## Mouse Conventions
The use of **click** throughout this documentation will refer to the action that you will perform to execute a computer event such as selecting a button.

Any uses of **click** in the instructions will refer to a left click of a computer mouse or a tap of a track pad with a single finger. **Right-clicks**, done through clicking the right button of the mouse or a tap of the track pad with two fingers, will be explicitly indicated. 

---

## Typographic Conventions
Convention Description                            | Example                           
-------------                                     |:-------------:                     
Commands and computer prompts:                    |**Save**, **Return**, **Click**, **Press**, **Type**,
                                                   **Exit**                     

Bolded words found in the body of the 
documentation represent an action that you will 
need to carry out. 
Text:                                             |`Enter your name`, `Commit message`

Text field prompts that require input will be 
presented in a monospace font.
Button sequence:                                  |`[Start]` > `[File]` > `[Settings]`

Buttons that you will need to click will have 
its name enclosed with opening and closing square 
brackets. For a sequence of button clicks, there 
will be a > symbol found between the two buttons. 
This symbol represents the successive order of 
the flow of buttons. 

The flow of buttons will be starting from the 
left and will move sequentially to the right.
Main and dialog windows:                          | "New Dialog Window"

Dialog windows are smaller graphical windows that 
appear within the main window. When these dialog 
windows appear, you will usually need to perform 
an action before returning to the main window.

Window names will be enclosed in opening and 
closing quotation marks. The final word before 
the closing quotation marks is “Window”. 

Note that the word “Window” may not actually 
appear in the window’s title bar but is just 
a marker in the documentation for windows. 



| col 3 is      | right-aligned | $1600 |
| col 2 is      | centered      |   $12 |
| zebra stripes | are neat      |    $1 |

| Tables        | Are           | Cool  |
| ------------- |:-------------:| -----:|
| col 3 is      | right-aligned | $1600 |
| col 2 is      | centered      |   $12 |
| zebra stripes | are neat      |    $1 |

## Conclusion

---

## Getting started

### Dependencies

Just the Docs is built for [Jekyll](https://jekyllrb.com), a static site generator. View the [quick start guide](https://jekyllrb.com/docs/) for more information. Just the Docs requires no special plugins and can run on GitHub Pages' standard Jekyll compiler. The [Jekyll SEO Tag plugin](https://github.com/jekyll/jekyll-seo-tag) is included by default (no need to run any special installation) to inject SEO and open graph metadata on docs pages. For information on how to configure SEO and open graph metadata visit the [Jekyll SEO Tag usage guide](https://jekyll.github.io/jekyll-seo-tag/usage/).

### Quick start: Use as a GitHub Pages remote theme

1. Add Just the Docs to your Jekyll site's `_config.yml` as a [remote theme](https://blog.github.com/2017-11-29-use-any-theme-with-github-pages/)
```yaml
remote_theme: pmarsceill/just-the-docs
```
<small>You must have GitHub Pages enabled on your repo, one or more Markdown files, and a `_config.yml` file. [See an example repository](https://github.com/pmarsceill/jtd-remote)</small>

### Local installation: Use the gem-based theme

1. Install the Ruby Gem
```bash
$ gem install just-the-docs
```
```yaml
# .. or add it to your your Jekyll site’s Gemfile
gem "just-the-docs"
```
2. Add Just the Docs to your Jekyll site’s `_config.yml`
```yaml
theme: "just-the-docs"
```
3. _Optional:_ Initialize search data (creates `search-data.json`)
```bash
$ bundle exec just-the-docs rake search:init
```
3. Run you local Jekyll server
```bash
$ jekyll serve
```
```bash
# .. or if you're using a Gemfile (bundler)
$ bundle exec jekyll serve
```
4. Point your web browser to [http://localhost:4000](http://localhost:4000)

If you're hosting your site on GitHub Pages, [set up GitHub Pages and Jekyll locally](https://help.github.com/en/articles/setting-up-your-github-pages-site-locally-with-jekyll) so that you can more easily work in your development environment.

### Configure Just the Docs

- [See configuration options]({{ site.baseurl }}{% link docs/configuration.md %})

---

## About the project

Just the Docs is &copy; 2017-2019 by [Patrick Marsceill](http://patrickmarsceill.com).

### License

Just the Docs is distributed by an [MIT license](https://github.com/pmarsceill/just-the-docs/tree/master/LICENSE.txt).

### Contributing

When contributing to this repository, please first discuss the change you wish to make via issue,
email, or any other method with the owners of this repository before making a change. Read more about becoming a contributor in [our GitHub repo](https://github.com/pmarsceill/just-the-docs#contributing).

#### Thank you to the contributors of Just the Docs!

<ul class="list-style-none">
{% for contributor in site.github.contributors %}
  <li class="d-inline-block mr-1">
     <a href="{{ contributor.html_url }}"><img src="{{ contributor.avatar_url }}" width="32" height="32" alt="{{ contributor.login }}"/></a>
  </li>
{% endfor %}
</ul>

### Code of Conduct

Just the Docs is committed to fostering a welcoming community.

[View our Code of Conduct](https://github.com/pmarsceill/just-the-docs/tree/master/CODE_OF_CONDUCT.md) on our GitHub repository.
